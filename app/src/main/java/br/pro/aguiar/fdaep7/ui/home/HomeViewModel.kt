package br.pro.aguiar.fdaep7.ui.home

import android.R
import android.content.Context
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdaep7.model.Car
import br.pro.aguiar.fdaep7.repository.Cars

class HomeViewModel : ViewModel() {
    fun setupAllCars(listView: ListView, context: Context){
        listView.adapter = ArrayAdapter(
            context,
            R.layout.simple_list_item_1,
            Cars.all()
        )
    }

    fun getCar(i: Int): Car {
        return Cars.get(i)
    }
}