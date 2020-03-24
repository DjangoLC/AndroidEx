package com.example.examen.bd

import androidx.room.*
import com.example.examen.data.Items

@Dao
interface ItemsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(vararg data: Items) : List<Long>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(data: Items) : Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(data: List<Items>)

    @Delete
    fun delete(data: Items)

    @Query("DELETE FROM items")
    fun delete()

    @Update
    fun update(data: Items)

    @Query("SELECT * FROM items")
    suspend fun getAll() : List<Items>
}