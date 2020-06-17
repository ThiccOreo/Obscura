package com.kalashnyk.denys.defaultproject.di.module

import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.*
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule(private val appDatabase: AppDatabase) {
    @Provides
    internal fun providesAppDatabase(): AppDatabase {
        return appDatabase
    }

    @Provides
    internal fun providesFeedDataSource(appDatabase: AppDatabase): FeedDataSource {
        return FeedDataSourceImpl(appDatabase)
    }

    @Provides
    internal fun providesUsersDataSource(appDatabase: AppDatabase): UserDataSource {
        return UsersDataSourceImpl(appDatabase)
    }

    @Provides
    internal fun providesRecipientsDataSource(appDatabase: AppDatabase): RecipientDataSource {
        return RecipientsDataSourceImpl(appDatabase)
    }
}