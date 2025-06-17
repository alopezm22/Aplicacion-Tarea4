package com.example.mediaexplorer.Screens

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mediaexplorer.ui.ui.Generos.GeneroViewModel
import com.example.mediaexplorer.ui.ui.Generos.HomeScreen
import com.example.mediaexplorer.ui.ui.Pelicula.FourPageViewModel
import com.example.mediaexplorer.ui.ui.Pelicula.SecondPageViewModel
import com.example.mediaexplorer.ui.ui.Pelicula.TerceraPageViewModel
import com.example.mediaexplorer.ui.ui.iniciosecion.AuthViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {

        initializer { GeneroViewModel(App().container.generoApiService) }

        initializer { TerceraPageViewModel(App().container.peliculaApiService) }

        initializer { FourPageViewModel(App().container.peliculaApiService) }

        initializer { SecondPageViewModel(App().container.peliculaApiService) }

        initializer { AuthViewModel(App().container.authApiService, App().baseContext)
        }
    }
}
fun CreationExtras.App(): MainActivity =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as MainActivity)