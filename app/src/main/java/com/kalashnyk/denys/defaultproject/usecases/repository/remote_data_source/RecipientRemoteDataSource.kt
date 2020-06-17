package com.kalashnyk.denys.defaultproject.usecases.repository.remote_data_source

import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.RecipientEntity
import com.kalashnyk.denys.defaultproject.usecases.repository.remote_data_source.communicator.ServerCommunicator
import io.reactivex.Single
import retrofit2.Response

//todo create abstract parent for RemoteDataSource

/**
 *
 */
interface RecipientRemoteDataSource {
    /**
     *
     */
    fun fetchRecipients(screenType: String): Single<Response<List<RecipientEntity>>>

    /**
     *
     */
    fun fetchNext(screenType: String, lastItemId: String): Single<Response<List<RecipientEntity>>>
}

/**
 *
 */
class RecipientRemoteDataSourceImpl(private val serverCommunicator: ServerCommunicator) : RecipientRemoteDataSource {

    override fun fetchRecipients(screenType: String): Single<Response<List<RecipientEntity>>> =
        serverCommunicator.fetchRecipients(screenType=screenType, lastItemId=null)


    override fun fetchNext(screenType: String, lastItemId: String): Single<Response<List<RecipientEntity>>> =
        serverCommunicator.fetchRecipients(screenType=screenType, lastItemId=lastItemId)
}