package br.pro.aguiar.fdaep7.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdaep7.MainViewModel
import br.pro.aguiar.fdaep7.R
import br.pro.aguiar.fdaep7.ViewModelFactory
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var mainViewModel: MainViewModel
    private lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)

        viewModelFactory = ViewModelFactory()

        homeViewModel =
            ViewModelProvider(this, viewModelFactory)
                .get(HomeViewModel::class.java)

        activity?.let {
            mainViewModel =
                ViewModelProvider(it, viewModelFactory) // MainActivity
                    .get(MainViewModel::class.java)
            mainViewModel.setStatusMsg("Olá usuário")
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var user = mainViewModel.user
        textViewHomeUser.text = "Olá ${user?.nome}"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel.setupAllCars(
            listViewHomeCarros,
            requireContext())
        listViewHomeCarros.setOnItemClickListener { adapterView, view, i, l ->
            mainViewModel.setStatusMsg("Consultando Carro")
            var carro = homeViewModel.getCar(i)
            mainViewModel.setCarro(carro)
//            Toast.makeText(
//                requireContext(),
//                carro.toString(),
//                Toast.LENGTH_LONG
//            ).show()
        }
    }

}