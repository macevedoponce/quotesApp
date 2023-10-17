package com.acevedo.examplemvvm.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acevedo.examplemvvm.data.model.QuoteModel
import com.acevedo.examplemvvm.data.model.QuoteProvider
import com.acevedo.examplemvvm.domain.GetQuotesUseCase
import com.acevedo.examplemvvm.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getQuotesUseCase: GetQuotesUseCase,
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase
) : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>() // para el progress bar mientras carga el backend

    fun onCreate() {
        //llamada al caso de uso para recuperar las citas
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase() //llamamos al caso de uso invoke
            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote(){
        isLoading.postValue(true)

        //llamar a caso de uso que devuelva una cita random
        val quote = getRandomQuoteUseCase()
        if(quote != null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
        //val currentQuote = QuoteProvider.random()
        //quoteModel.postValue(currentQuote)
    }



}