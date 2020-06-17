package com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.kalashnyk.denys.defaultproject.data.BaseModel
import com.kalashnyk.denys.defaultproject.utils.CACHED_VALUE
import com.kalashnyk.denys.defaultproject.utils.DEFAULT_CACHE_VALUE
import com.kalashnyk.denys.defaultproject.utils.DEFAULT_SCREEN

@Entity(tableName="recipients")
data class RecipientEntity (

    /**
     *
     */
    @PrimaryKey(autoGenerate=true)
    @SerializedName("id")
    val id: Int? = null,

    /**
     *
     */
    @SerializedName("name")
    val name: String? = null,

    /**
     *
     */
    @SerializedName("surname")
    val surname: String? = null,

    /**
     *
     */
    @SerializedName("fathername")
    val fathername: String? = null,

    /**
     *
     */
    @SerializedName("avatar_preview")
    val avatarPreview: String? = null,

    /**
     *
     */
    /**
     *
     */
    var screenType: String?=DEFAULT_SCREEN,

    /**
     *
     */
    var cached: Int?=DEFAULT_CACHE_VALUE,

    /**
     *
     */
    val favoriteCategories: List<CategoryEntity>? = mutableListOf(),

    /**
     *
     */
    val location: LocationEntity? = null

) : BaseModel() {

    fun convertItemForDataSource(
        item: RecipientEntity,
        isCached: Boolean?,
        screenType: String?
    ): RecipientEntity {
        isCached?.let { item.cached=CACHED_VALUE }
        screenType?.let { item.screenType=it }
        return item
    }
}
