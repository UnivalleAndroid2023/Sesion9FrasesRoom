package com.gonzalez.blanchard.frasesroom.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.gonzalez.blanchard.frasesroom.data.database.AppDatabase
import com.gonzalez.blanchard.frasesroom.data.database.entity.QuoteEntity
import kotlinx.coroutines.launch

class InsertQuoteViewModel : ViewModel() {

    fun insertQuote(
        context: Context,
        quote: String,
        autor: String
    ){

        viewModelScope.launch {

            val db: AppDatabase = AppDatabase.getInstance(context)
            /* val db = Room.databaseBuilder(
                 context,
                 AppDatabase::class.java, "database-name"
             ).build()*/

            val quoteDao = db.quoteDao()
            val quoteEntity = QuoteEntity(
                uid = 0,
                quote = quote,
                author = autor
            )
            quoteDao.insertQuote(quoteEntity)

        }

    }

}