package com.kalashnyk.denys.defaultproject.data.card_models

import com.kalashnyk.denys.defaultproject.data.BaseModel
import com.kalashnyk.denys.defaultproject.presentation.adapter.paginglist.BaseCardModel
import com.kalashnyk.denys.defaultproject.usecases.repository.database.entity.ThemeEntity
import com.kalashnyk.denys.defaultproject.utils.CARD_EVENT

class EventCardModel(private var feed : ThemeEntity) : BaseCardModel() {

    override fun getCardId(): Int {
        return feed.id
    }

    override fun getCardType(): String {
        return CARD_EVENT
    }

    override fun getBaseModel(): BaseModel {
        return feed
    }
}