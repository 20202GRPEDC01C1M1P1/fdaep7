package br.pro.aguiar.fdaep7

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdaep7.ui.home.HomeViewModel
import br.pro.aguiar.fdaep7.ui.login.LoginViewModel

class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel() as T
        } else if (modelClass.isAssignableFrom(LoginViewModel::class.java)){
            return LoginViewModel() as T
        } else if (modelClass.isAssignableFrom(HomeViewModel::class.java)){
            return HomeViewModel() as T
        }
        throw IllegalArgumentException("Classe ViewModel Desconhecida")
    }
}