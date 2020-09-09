package br.pro.aguiar.fdaep7.repository

import br.pro.aguiar.fdaep7.model.User

object Users {

    var usuarios = listOf(
        User("thi@go.com", "654321", "Thiago"),
        User("agui@r.com", "654321", "Aguiar")
    )

    fun validarUsuario(
        email: String, senha: String) : User? {
        usuarios.forEach {
            if (it.email == email)
                if (it.senha == senha)
                    return it
        }
        return null
    }

}