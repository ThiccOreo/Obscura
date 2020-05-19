package com.kalashnyk.denys.defaultproject.presentation.activities.auth.flow

import android.text.TextWatcher
import com.kalashnyk.denys.defaultproject.presentation.base.BaseFlow
import com.kalashnyk.denys.defaultproject.presentation.navigation.fragment_navigator.model.Pages

/**
 *
 */
interface AuthFlow : BaseFlow {

    /**
     * for social auth
     */
    enum class SocialAuthType {

        /**
         *
         */
        GOOGLE,

        /**
         *
         */
        FACEBOOK
    }

    /**
     *
     */
    interface AuthListener : BaseFlow.BaseListener {
        fun authRequest(flowModel: AuthFlowModel, callback: AuthCallback)
        fun socialAuth(type: SocialAuthType, callback: AuthCallback?)
        fun openScreen(page: Pages)
    }

    /**
     *
     */
    interface AuthCallback : BaseFlow.IBaseCallback, TextWatcher {
        fun showError(error: AuthFlowErrorModel)
        fun hideError()
    }
}