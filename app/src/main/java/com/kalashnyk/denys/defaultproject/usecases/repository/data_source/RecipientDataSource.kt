package com.kalashnyk.denys.defaultproject.usecases.repository.data_source


import androidx.paging.DataSource
import com.kalashnyk.denys.defaultproject.presentation.adapter.paginglist.BaseCardModel
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.AppDatabase
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.RecipientEntity
import com.kalashnyk.denys.defaultproject.utils.ConverterFactory

//todo create abstract parent for DataSource

/**
 *
 */
interface RecipientDataSource {

    /**
     *
     */
    fun getCardsModelsFactory(screenType: String, converterFactory: ConverterFactory)
            : DataSource.Factory<Int, BaseCardModel>

    /**
     *
     */
    fun deleteCachedItems(screenType: String)

    /**
     *
     */
    fun insert(items: List<RecipientEntity>)

    /**
     *
     */
    fun insertAndClearCache(items: List<RecipientEntity>, typeScreen: String?)
}

/**
 *
 */
class RecipientsDataSourceImpl(private val database: AppDatabase) : RecipientDataSource {

    /**
     *
     */
    override fun getCardsModelsFactory(
        screenType: String, converterFactory: ConverterFactory
    ): DataSource.Factory<Int, BaseCardModel> {
        return database.recipientDao().getDataSource(screenType)
            .mapByPage(converterFactory::convert)
    }

    /**
     *
     */
    override fun deleteCachedItems(screenType: String): Unit=
        database.recipientDao().deleteCachedItems(screenType)

    override fun insert(items: List<RecipientEntity>) : Unit=
        database.recipientDao().insert(items)


    override fun insertAndClearCache(items: List<RecipientEntity>, typeScreen: String?): Unit=
        database.recipientDao().insertAndClearCache(items, typeScreen)

}