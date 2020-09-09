package br.pro.aguiar.fdaep7.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdaep7.MainViewModel
import br.pro.aguiar.fdaep7.R
import br.pro.aguiar.fdaep7.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_info_car.*

class InfoCarFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_car, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModelFactory = ViewModelFactory()
        activity?.let {
            mainViewModel =
                ViewModelProvider(it, viewModelFactory)[MainViewModel::class.java]
        }

        mainViewModel.carroMarca.observe(viewLifecycleOwner, Observer {
            if (it != null)
                textViewInfoCarMarca.text = it
        })

        mainViewModel.carroModelo.observe(viewLifecycleOwner, Observer {
            if (it != null)
                textViewInfoCarModelo.text = it
        })

        mainViewModel.carroPlaca.observe(viewLifecycleOwner, Observer {
            if (it != null)
                textViewInfoCarPlaca.text = it
        })
    }
}