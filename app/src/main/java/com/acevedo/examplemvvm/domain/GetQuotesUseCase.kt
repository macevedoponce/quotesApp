package com.acevedo.examplemvvm.domain

import com.acevedo.examplemvvm.data.QuoteRepository
import com.acevedo.examplemvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor( private val repository: QuoteRepository) {

    //private val repository = QuoteRepository() -> no deberiamos de tener ninguna instancia para poder inyectar clases
    suspend operator fun invoke() = repository.getAllQuotes()

}