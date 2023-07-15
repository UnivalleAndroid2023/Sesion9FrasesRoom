package com.gonzalez.blanchard.frasesroom.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gonzalez.blanchard.frasesroom.model.QuoteModel
import com.gonzalez.blanchard.frasesroom.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val frase = MutableLiveData<QuoteModel>()

    init{
        randomQuote()
    }

    fun randomQuote(){
        val fraseActual = QuoteProvider.random()
        frase.postValue(fraseActual)
    }

}