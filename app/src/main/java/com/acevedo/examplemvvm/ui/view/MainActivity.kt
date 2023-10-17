package com.acevedo.examplemvvm.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.acevedo.examplemvvm.databinding.ActivityMainBinding
import com.acevedo.examplemvvm.ui.viewModel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint //preparamos la clase para inyectar
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recuperar citas
        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer {currentQuote->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author
        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.progress.isVisible = it //el it es el estado que se le manda al progressBar, si se hace una llamada es true
        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }
    }
}