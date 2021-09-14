package ru.andreikud.retrofitpracticing.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import ru.andreikud.retrofitpracticing.R
import ru.andreikud.retrofitpracticing.RetroApp
import ru.andreikud.retrofitpracticing.ui.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val app = application as RetroApp
        viewModel.getUsers(app.sandboxApi)
    }
}