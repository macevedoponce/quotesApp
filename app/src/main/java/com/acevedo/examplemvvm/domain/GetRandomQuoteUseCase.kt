package com.acevedo.examplemvvm.domain

import com.acevedo.examplemvvm.data.model.QuoteModel
import com.acevedo.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    //Caso de Uso que recupera la lista de citas y devuelve una de ellas aleatoria
    operator fun invoke():QuoteModel?{
        //recuperamos todos los quotes
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (0..quotes.size -1 ).random()
            return quotes[randomNumber]
        }
        return null
    }
}