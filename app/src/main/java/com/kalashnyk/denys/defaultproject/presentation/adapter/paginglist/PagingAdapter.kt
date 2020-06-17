package com.kalashnyk.denys.defaultproject.presentation.adapter.paginglist

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.kalashnyk.denys.defaultproject.R
import com.kalashnyk.denys.defaultproject.utils.CARD_ARTICLE
import com.kalashnyk.denys.defaultproject.utils.CARD_EVENT
import com.kalashnyk.denys.defaultproject.utils.CARD_RECIPIENT
import com.kalashnyk.denys.defaultproject.utils.CARD_USER

/**
 * todo finished paging adapter
 */
class PagingAdapter(diffUtil: DiffUtil.ItemCallback<BaseCardModel>) :
    MultiTypeDataBoundAdapter<BaseCardModel, ViewDataBinding>(diffUtil) {

    override fun getItemLayoutId(position: Int): Int {
        getItem(position)?.let {
            return when (it.getCardType()) {
                CARD_USER -> R.layout.item_user
                CARD_EVENT -> R.layout.item_event
                CARD_ARTICLE -> R.layout.item_article
                CARD_RECIPIENT -> R.layout.item_recipient
                else -> -1
            }
        }
        return -1
    }

    override fun bindItem(holder: DataBoundViewHolder<ViewDataBinding>, position: Int, payloads: List<Any>) {
        super.bindItem(holder, position, payloads)

    }
}