package com.gonzalez.blanchard.frasesroom.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.gonzalez.blanchard.frasesroom.data.database.entity.QuoteEntity

@Dao
interface QuoteDao {

    @Query("SELECT * FROM quotes")
    fun getAll(): List<QuoteEntity>

    @Insert
    fun insertQuote(quote: QuoteEntity?)

}