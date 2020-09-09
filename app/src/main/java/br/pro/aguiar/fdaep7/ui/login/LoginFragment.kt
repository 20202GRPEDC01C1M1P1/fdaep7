package br.pro.aguiar.fdaep7.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.pro.aguiar.fdaep7.MainViewModel
import br.pro.aguiar.fdaep7.R
import br.pro.aguiar.fdaep7.ViewModelFactory
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var mainViewModel: MainViewModel
    private lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModelFactory = ViewModelFactory()
        loginViewModel =
            ViewModelProvider(this, viewModelFactory) // Escopo
                .get(LoginViewModel::class.java) // ViewModel
        activity?.let {
            mainViewModel =
                ViewModelProvider(it, viewModelFactory) // MainActivity
                    .get(MainViewModel::class.java)
            mainViewModel.setStatusMsg("Informe suas credencias.")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnValidarUsuario.setOnClickListener {
            var user = loginViewModel.validarUsuario(
                editTextTextEmailAddress.text.toString(),
                editTextNumberPassword.text.toString()
            )

            if (user != null) {
                mainViewModel.user = user
                findNavController().navigate(R.id.homeFragment)
            } else {
                Toast.makeText(
                    activity, "Credenciais inválidas.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }

}