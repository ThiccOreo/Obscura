package com.kalashnyk.denys.defaultproject.usecases

import androidx.paging.DataSource
import com.kalashnyk.denys.defaultproject.presentation.adapter.paginglist.BaseCardModel
import com.kalashnyk.denys.defaultproject.usecases.repository.RecipientRepository
import com.kalashnyk.denys.defaultproject.utils.ConverterFactory
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/**
 *
 */
interface RecipientsUseCases {

    /**
     *
     */
    fun fetchData(screenType: String): Completable

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
class RecipientsUseCasesImpl (private val repository: RecipientRepository) : RecipientsUseCases {

    //todo use compositer for subscribeOn and observeOn
    override fun fetchData(screenType: String): Completable=
        repository.fetchRecipients(screenType)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

    //todo use compositer for subscribeOn and observeOn
    override fun fetchNext(screenType: String, lastItemId: String): Completable=
        repository.fetchNext(screenType, lastItemId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

    //todo use compositer for subscribeOn and observeOn
    override fun deleteCachedItems(screenType: String): Completable=
        repository.deleteCachedItems(screenType)
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())

    override fun getCardsFactory(
        screenType: String,
        modelConverter: ConverterFactory
    ): DataSource.Factory<Int, BaseCardModel> =
        repository.getCardsFactory(screenType, modelConverter)
}
