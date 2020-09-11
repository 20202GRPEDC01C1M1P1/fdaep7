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
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_status.*

class StatusFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_status, container, false)
        viewModelFactory = ViewModelFactory()
        activity?.let {
            mainViewModel =
                ViewModelProvider(it, viewModelFactory)
                    .get(MainViewModel::class.java)
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        mainViewModel.statusMsg.observe(viewLifecycleOwner, Observer {
//            Snackbar
//                .make(
//                    root_layout_status,
//                    it,
//                    Snackbar.LENGTH_LONG
//                ).show()
//        })

    }
}