package com.acevedo.examplemvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.acevedo.examplemvvm.model.QuoteModel
import com.acevedo.examplemvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}