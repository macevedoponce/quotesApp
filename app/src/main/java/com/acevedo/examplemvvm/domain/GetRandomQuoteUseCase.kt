package com.acevedo.examplemvvm.domain

import com.acevedo.examplemvvm.data.model.QuoteModel
import com.acevedo.examplemvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider){
    //Caso de Uso que recupera la lista de citas y devuelve una de ellas aleatoria
    operator fun invoke():QuoteModel?{
        //recuperamos todos los quotes
        val quotes = quoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices ).random()
            return quotes[randomNumber]
        }
        return null
    }
}