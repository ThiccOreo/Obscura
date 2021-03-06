package com.kalashnyk.denys.defaultproject.di.module

import android.app.Application
import com.kalashnyk.denys.defaultproject.App
import com.kalashnyk.denys.defaultproject.di.scope.ViewModelScope
import com.kalashnyk.denys.defaultproject.domain.*
import com.kalashnyk.denys.defaultproject.usecases.FeedUseCases
import com.kalashnyk.denys.defaultproject.usecases.Interactor
import com.kalashnyk.denys.defaultproject.usecases.RecipientsUseCases
import com.kalashnyk.denys.defaultproject.usecases.UserUseCases
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule(app: App) {

    internal var app: Application = app

    @ViewModelScope
    @Provides
    internal fun providesAllUserViewModel(interactor: Interactor): AllUsersViewModel {
        return AllUsersViewModel(app, interactor)
    }

    @ViewModelScope
    @Provides
    internal fun providesSingleUserViewModel(interactor: Interactor): SingleUserViewModel {
        return SingleUserViewModel(app, interactor)
    }

    @ViewModelScope
    @Provides
    internal fun providesFeedViewModel(feedUseCases: FeedUseCases): FeedViewModel {
        return FeedViewModel(feedUseCases)
    }

    @ViewModelScope
    @Provides
    internal fun providesUserViewModel(userUseCases: UserUseCases): UserViewModel {
        return UserViewModel(userUseCases)
    }

    @ViewModelScope
    @Provides
    internal fun providesRecipientViewModel(recipientsUseCases: RecipientsUseCases): RecipientViewModel {
        return RecipientViewModel(recipientsUseCases)
    }
}