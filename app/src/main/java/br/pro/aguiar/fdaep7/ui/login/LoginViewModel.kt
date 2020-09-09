package br.pro.aguiar.fdaep7.ui.login

import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdaep7.model.User
import br.pro.aguiar.fdaep7.repository.Users

class LoginViewModel : ViewModel() {
    fun validarUsuario(email: String, senha: String) : User? {
        return Users.validarUsuario(email, senha)
    }
}