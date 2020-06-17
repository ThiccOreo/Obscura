package com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.dao

import androidx.paging.DataSource
import androidx.room.*
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.BaseDao
import com.kalashnyk.denys.defaultproject.usecases.repository.data_source.database.entity.RecipientEntity

@Dao
interface RecipientDao : BaseDao<RecipientEntity> {
    @Query("SELECT * FROM recipients")
    fun getAll(): List<RecipientEntity>

    @Query("SELECT * FROM recipients WHERE id = :id")
    fun getById(id: Int): RecipientEntity

    @Insert(onConflict=OnConflictStrategy.REPLACE)
    fun insertList(listEntities: List<RecipientEntity>)

    @Update
    fun updateAll(list: List<RecipientEntity>)

    @Query("SELECT * FROM recipients WHERE screenType = :screenType")
    fun getDataSource(
        screenType: String
    ): DataSource.Factory<Int, RecipientEntity>

    @Query("DELETE FROM recipients WHERE screenType = :screenType AND cached = 1")
    fun deleteCachedItems(screenType : String)

    @Query("DELETE FROM recipients WHERE screenType = :screenType")
    fun deleteAllItemsByType(screenType: String)

    @Transaction
    fun insertAndClearCache(
        listEntities: List<RecipientEntity>,
        screenType: String?
    ) {
        screenType?.let {
            deleteAllItemsByType(it)
        }
        insert(listEntities)
    }
}