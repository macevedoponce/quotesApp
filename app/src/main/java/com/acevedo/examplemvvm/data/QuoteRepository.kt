package com.acevedo.examplemvvm.data

import com.acevedo.examplemvvm.data.model.QuoteModel
import com.acevedo.examplemvvm.data.model.QuoteProvider
import com.acevedo.examplemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api :QuoteService,
    private val quoteProvider: QuoteProvider
) {
    //private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes() //recuperamos las citas de internet
        quoteProvider.quotes = response //guardamos la respuesta del servidor
        return response //devuelvo la respuesta
    }
}