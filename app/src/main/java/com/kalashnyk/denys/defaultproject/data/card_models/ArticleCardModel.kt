package com.kalashnyk.denys.defaultproject.data.card_models

import com.kalashnyk.denys.defaultproject.data.BaseModel
import com.kalashnyk.denys.defaultproject.presentation.adapter.paginglist.BaseCardModel
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.ThemeEntity
import com.kalashnyk.denys.defaultproject.utils.CARD_ARTICLE

class ArticleCardModel(private var feed : ThemeEntity) : BaseCardModel() {

    override fun getCardId(): String {
        return feed.id.toString()
    }

    override fun getCardType(): String {
        return CARD_ARTICLE
    }

    override fun getBaseModel(): BaseModel {
        return feed
    }
}