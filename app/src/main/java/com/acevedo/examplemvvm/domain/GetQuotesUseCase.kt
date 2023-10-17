package com.acevedo.examplemvvm.domain

import com.acevedo.examplemvvm.data.QuoteRepository
import com.acevedo.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}