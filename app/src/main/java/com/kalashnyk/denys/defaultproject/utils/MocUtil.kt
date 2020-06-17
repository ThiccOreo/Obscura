package com.kalashnyk.denys.defaultproject.utils

import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.RecipientEntity
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.ThemeEntity
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.UserEntity

object MocUtil {

    fun mocListThemes(): List<ThemeEntity> {

        val list=ArrayList<ThemeEntity>()
        val mocArticleShortDescription = "Journalists utilize the Who, What, Where, When, Why and How method for getting across the facts of their stories, and following this process is the first step in crafting a compelling product description."
        val mocEventShortDescription = "Setting up your free Eventbrite page is very simple when it comes to the technical side of things… but you’re not alone if you find the thought of writing copy for your event a bit daunting."

        val entity1=ThemeEntity(1, CARD_EVENT, ("$CARD_EVENT item 1"), mocEventShortDescription, ("$CARD_EVENT category 1"))
        list.add(entity1)
        val entity2=ThemeEntity(2, CARD_ARTICLE, ("$CARD_ARTICLE item 2"), mocArticleShortDescription, ("$CARD_ARTICLE category 2"))
        list.add(entity2)
        val entity3=ThemeEntity(3, CARD_EVENT, ("$CARD_EVENT item 3"), mocEventShortDescription, ("$CARD_EVENT category 3"))
        list.add(entity3)
        val entity4=ThemeEntity(4, CARD_ARTICLE, ("$CARD_ARTICLE item 4"), mocArticleShortDescription, ("$CARD_ARTICLE category 4"))
        list.add(entity4)
        val entity5=ThemeEntity(5, CARD_EVENT, ("$CARD_EVENT item 5"), mocEventShortDescription, ("$CARD_EVENT category 5"))
        list.add(entity5)
        val entity6=ThemeEntity(6, CARD_ARTICLE, ("$CARD_ARTICLE item 6"), mocArticleShortDescription, ("$CARD_ARTICLE category 6"))
        list.add(entity6)
        val entity7=ThemeEntity(7, CARD_EVENT, ("$CARD_EVENT item 7"), mocEventShortDescription, ("$CARD_EVENT category 7"))
        list.add(entity7)
        val entity8=ThemeEntity(8, CARD_ARTICLE, ("$CARD_ARTICLE item 8"), mocArticleShortDescription, ("$CARD_ARTICLE category 8"))
        list.add(entity8)
        val entity9=ThemeEntity(9, CARD_EVENT, ("$CARD_EVENT item 9"), mocEventShortDescription, ("$CARD_EVENT category 9"))
        list.add(entity9)
        val entity10=ThemeEntity(10, CARD_ARTICLE, ("$CARD_ARTICLE item 10"), mocArticleShortDescription, ("$CARD_ARTICLE category 10"))
        list.add(entity10)
        val entity11=ThemeEntity(11, CARD_EVENT, ("$CARD_EVENT item 11"), mocEventShortDescription, ("$CARD_EVENT category 11"))
        list.add(entity11)
        val entity12=ThemeEntity(12, CARD_ARTICLE, ("$CARD_ARTICLE item 12"), mocArticleShortDescription, ("$CARD_ARTICLE category 12"))
        list.add(entity12)
        val entity13=ThemeEntity(13, CARD_EVENT, ("$CARD_EVENT item 13"), mocEventShortDescription, ("$CARD_EVENT category 12"))
        list.add(entity13)
        val entity14=ThemeEntity(14, CARD_ARTICLE, ("$CARD_ARTICLE item 14"), mocArticleShortDescription, ("$CARD_ARTICLE category 14"))
        list.add(entity14)
        val entity15=ThemeEntity(15, CARD_EVENT, ("$CARD_EVENT item 15"), mocEventShortDescription, ("$CARD_EVENT category 15"))
        list.add(entity15)
        val entity16=ThemeEntity(16, CARD_ARTICLE, ("$CARD_ARTICLE item 16"), mocArticleShortDescription, ("$CARD_ARTICLE category 16"))
        list.add(entity16)
        val entity17=ThemeEntity(17, CARD_EVENT, ("$CARD_EVENT item 17"), mocEventShortDescription, ("$CARD_EVENT category 17"))
        list.add(entity17)
        val entity18=ThemeEntity(18, CARD_ARTICLE, ("$CARD_ARTICLE item 18"), mocArticleShortDescription, ("$CARD_ARTICLE category 18"))
        list.add(entity18)
        val entity19=ThemeEntity(19, CARD_EVENT, ("$CARD_EVENT item 19"), mocEventShortDescription, ("$CARD_EVENT category 19"))
        list.add(entity19)
        val entity20=ThemeEntity(20, CARD_ARTICLE, ("$CARD_ARTICLE item 20"), mocArticleShortDescription, ("$CARD_ARTICLE category 20"))
        list.add(entity20)
        val entity21=ThemeEntity(21, CARD_EVENT, ("$CARD_EVENT item 21"), mocEventShortDescription, ("$CARD_EVENT category 21"))
        list.add(entity21)
        val entity22=ThemeEntity(22, CARD_ARTICLE, ("$CARD_ARTICLE item 22"), mocArticleShortDescription, ("$CARD_ARTICLE category 22"))
        list.add(entity22)
        val entity23=ThemeEntity(23, CARD_EVENT, ("$CARD_EVENT item 23"), mocEventShortDescription, ("$CARD_EVENT category 23"))
        list.add(entity23)
        val entity24=ThemeEntity(24, CARD_ARTICLE, ("$CARD_ARTICLE item 24"), mocArticleShortDescription, ("$CARD_ARTICLE category 24"))
        list.add(entity24)
        val entity25=ThemeEntity(25, CARD_EVENT, ("$CARD_EVENT item 25"), mocEventShortDescription, ("$CARD_EVENT category 25"))
        list.add(entity25)

        return list
    }

    fun mocListUsers(): List<UserEntity> {
        val list=ArrayList<UserEntity>()
        val entity1=UserEntity(1, ("$CARD_USER name 1"), ("$CARD_USER surname 1"), ("$CARD_USER fathername 1"))
        list.add(entity1)
        val entity2=UserEntity(2, ("$CARD_USER name 2"), ("$CARD_USER surname 2"), ("$CARD_USER fathername 2"))
        list.add(entity2)
        val entity3=UserEntity(3, ("$CARD_USER name 3"), ("$CARD_USER surname 3"), ("$CARD_USER fathername 3"))
        list.add(entity3)
        val entity4=UserEntity(4, ("$CARD_USER name 4"), ("$CARD_USER surname 4"), ("$CARD_USER fathername 4"))
        list.add(entity4)
        val entity5=UserEntity(5, ("$CARD_USER name 5"), ("$CARD_USER surname 5"), ("$CARD_USER fathername 5"))
        list.add(entity5)
        val entity6=UserEntity(6, ("$CARD_USER name 6"), ("$CARD_USER surname 6"), ("$CARD_USER fathername 6"))
        list.add(entity6)
        val entity7=UserEntity(7, ("$CARD_USER name 7"), ("$CARD_USER surname 7"), ("$CARD_USER fathername 7"))
        list.add(entity7)
        val entity8=UserEntity(8, ("$CARD_USER name 8"), ("$CARD_USER surname 8"), ("$CARD_USER fathername 8"))
        list.add(entity8)
        val entity9=UserEntity(9, ("$CARD_USER name 9"), ("$CARD_USER surname 9"), ("$CARD_USER fathername 9"))
        list.add(entity9)
        val entity10=UserEntity(10, ("$CARD_USER name 10"), ("$CARD_USER surname 10"), ("$CARD_USER fathername 10"))
        list.add(entity10)
        val entity11=UserEntity(11, ("$CARD_USER name 11"), ("$CARD_USER surname 11"), ("$CARD_USER fathername 11"))
        list.add(entity11)
        val entity12=UserEntity(12, ("$CARD_USER name 12"), ("$CARD_USER surname 12"), ("$CARD_USER fathername 12"))
        list.add(entity12)
        val entity13=UserEntity(13, ("$CARD_USER name 13"), ("$CARD_USER surname 12"), ("$CARD_USER fathername 13"))
        list.add(entity13)
        val entity14=UserEntity(14, ("$CARD_USER name 14"), ("$CARD_USER surname 14"), ("$CARD_USER fathername 14"))
        list.add(entity14)
        val entity15=UserEntity(15, ("$CARD_USER name 15"), ("$CARD_USER surname 15"), ("$CARD_USER fathername 15"))
        list.add(entity15)
        val entity16=UserEntity(16, ("$CARD_USER name 16"), ("$CARD_USER surname 16"), ("$CARD_USER fathername 16"))
        list.add(entity16)
        val entity17=UserEntity(17, ("$CARD_USER name 17"), ("$CARD_USER surname 17"), ("$CARD_USER fathername 17"))
        list.add(entity17)
        val entity18=UserEntity(18, ("$CARD_USER name 18"), ("$CARD_USER surname 18"), ("$CARD_USER fathername 18"))
        list.add(entity18)
        val entity19=UserEntity(19, ("$CARD_USER name 19"), ("$CARD_USER surname 19"), ("$CARD_USER fathername 19"))
        list.add(entity19)
        val entity20=UserEntity(20, ("$CARD_USER name 20"), ("$CARD_USER surname 20"), ("$CARD_USER fathername 20"))
        list.add(entity20)
        val entity21=UserEntity(21, ("$CARD_USER name 21"), ("$CARD_USER surname 21"), ("$CARD_USER fathername 21"))
        list.add(entity21)
        val entity22=UserEntity(22, ("$CARD_USER name 22"), ("$CARD_USER surname 22"), ("$CARD_USER fathername 22"))
        list.add(entity22)
        val entity23=UserEntity(23, ("$CARD_USER name 23"), ("$CARD_USER surname 23"), ("$CARD_USER fathername 23"))
        list.add(entity23)
        val entity24=UserEntity(24, ("$CARD_USER name 24"), ("$CARD_USER surname 24"), ("$CARD_USER fathername 24"))
        list.add(entity24)
        val entity25=UserEntity(25, ("$CARD_USER name 25"), ("$CARD_USER surname 25"), ("$CARD_USER fathername 25"))
        list.add(entity25)

        return list
    }

    fun mocListRecipients(): List<RecipientEntity> {
        val list=ArrayList<RecipientEntity>()
        val entity1=RecipientEntity(1, ("$CARD_RECIPIENT name 1"), ("$CARD_RECIPIENT surname 1"), ("$CARD_RECIPIENT fathername 1"))
        list.add(entity1)
        val entity2=RecipientEntity(2, ("$CARD_RECIPIENT name 2"), ("$CARD_RECIPIENT surname 2"), ("$CARD_RECIPIENT fathername 2"))
        list.add(entity2)

        return list
    }

}