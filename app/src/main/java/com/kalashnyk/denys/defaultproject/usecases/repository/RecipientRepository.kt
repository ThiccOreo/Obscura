package com.kalashnyk.denys.defaultproject.usecases.repository

import androidx.paging.DataSource
import com.kalashnyk.denys.defaultproject.presentation.adapter.paginglist.BaseCardModel
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.RecipientDataSource
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.RecipientEntity
import com.kalashnyk.denys.defaultproject.usecases.repository.remote_data_source.RecipientRemoteDataSource
import com.kalashnyk.denys.defaultproject.utils.ConverterFactory
import com.kalashnyk.denys.defaultproject.utils.MocUtil
import io.reactivex.Completable
import io.reactivex.Single

interface RecipientRepository {

    /**
     *
     */
    fun fetchRecipients(screenType: String): Completable

    /**
     *
     */
    fun fetchNext(screenType: String, lastItemId: String): Completable

    /**
     *
     */
    fun deleteCachedItems(screenType: String): Completable

    /**
     *
     */
    fun getCardsFactory(
        screenType: String,
        modelConverter: ConverterFactory
    ): DataSource.Factory<Int, BaseCardModel>
}

/**
 *
 */
class RecipientRepositoryImpl (
    private val recipientRemoteDataSource: RecipientRemoteDataSource,
    private val recipientDataSource: RecipientDataSource
) : RecipientRepository {

    override fun fetchRecipients(screenType: String): Completable {
        return recipientRemoteDataSource
            .fetchRecipients(screenType)
            // todo remove moc logic and add handling error when api logic implemented
            .doOnError {
                val list: List<RecipientEntity> = MocUtil.mocListRecipients()
                list.forEach {
                    it.convertItemForDataSource(item = it, isCached = false, screenType = screenType)
                }
                saveItems(list, false, screenType)
            }
            .flatMapCompletable {
                Completable.fromAction { }
            }
    }

    override fun fetchNext(screenType: String, lastItemId: String): Completable {
        return recipientRemoteDataSource
            .fetchNext(screenType, lastItemId)
            // todo remove moc logic and add handling error when api logic implemented
            .flatMap {
                val list: List<RecipientEntity> = MocUtil.mocListRecipients()
                list.forEach {
                    it.convertItemForDataSource(item = it, isCached = true, screenType = screenType)
                }
                Single.just(list)
            }
            .flatMapCompletable {
                Completable.fromAction { saveItems(it, true, screenType) }
            }
    }

    override fun deleteCachedItems(screenType: String): Completable=
        Completable.fromAction { recipientDataSource.deleteCachedItems(screenType) }


    override fun getCardsFactory(
        screenType: String,
        modelConverter: ConverterFactory
    ): DataSource.Factory<Int, BaseCardModel> =
        recipientDataSource.getCardsModelsFactory(screenType, modelConverter)

    private fun saveItems(
        items: List<RecipientEntity>, isCached: Boolean, typeScreen: String?
    ) {
        if (isCached) {
            recipientDataSource.insert(items)
        } else {
            recipientDataSource.insertAndClearCache(items, typeScreen)
        }
    }

}