package com.kalashnyk.denys.defaultproject.presentation.fragments.themes

import android.os.Bundle
import androidx.databinding.ObservableBoolean
import com.kalashnyk.denys.defaultproject.R
import com.kalashnyk.denys.defaultproject.databinding.ThemesDataBinding
import com.kalashnyk.denys.defaultproject.di.component.ViewModelComponent
import com.kalashnyk.denys.defaultproject.domain.FeedViewModel
import com.kalashnyk.denys.defaultproject.presentation.base.BaseFeedFragment
import javax.inject.Inject

/**
 * @author Kalashnyk Denys e-mail: kalashnyk.denys@gmail.com
 */
class ThemesFragment : BaseFeedFragment<ThemesDataBinding>() {

    var viewModel: FeedViewModel? = null
        @Inject set

    override fun injectDependency(component: ViewModelComponent) {
        component.inject(this)
    }

    /**
     * @param savedInstanceState
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //ToDo get extras from bundle
        }
    }

    /**
     * @return
     */
    override fun getLayoutId(): Int=R.layout.fragment_themes

    /**
     * @param binding
     */
    override fun setupViewLogic(binding: ThemesDataBinding) {
        binding.refreshing=ObservableBoolean(false)
        binding.loading=ObservableBoolean(true)
    }

    companion object {
        @JvmStatic
        fun newInstance(): ThemesFragment {
            return ThemesFragment()
        }
    }
}
