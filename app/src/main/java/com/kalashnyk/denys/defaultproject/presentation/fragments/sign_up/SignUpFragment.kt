package com.kalashnyk.denys.defaultproject.presentation.fragments.sign_up

import android.content.Context
import android.os.Bundle
import android.view.View
import com.kalashnyk.denys.defaultproject.R
import com.kalashnyk.denys.defaultproject.databinding.SignUpDataBinding
import com.kalashnyk.denys.defaultproject.presentation.activities.auth.flow.AuthFlowErrorModel
import com.kalashnyk.denys.defaultproject.presentation.activities.auth.flow.IAuthFlow
import com.kalashnyk.denys.defaultproject.presentation.base.BaseFragment

class SignUpFragment : BaseFragment<SignUpDataBinding>(), IAuthFlow.IAuthCallback {

    private var listener: IAuthFlow.IAuthListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //ToDo get extras from bundle
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IAuthFlow.IAuthListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun getLayoutId(): Int = R.layout.fragment_sign_up

    override fun setupViewLogic(binding: SignUpDataBinding) {
        binding.listener = listener
    }

    override fun showError(error: AuthFlowErrorModel) {
        //ToDo show error for validation inputs
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SignUpFragment().apply {
                arguments = Bundle().apply {
                    //todo put bundle
                }
            }
    }
}
