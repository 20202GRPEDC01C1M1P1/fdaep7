package br.pro.aguiar.fdaep7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdaep7.model.Car
import br.pro.aguiar.fdaep7.model.User

class MainViewModel() : ViewModel() {

    val statusMsg : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val carroMarca : MutableLiveData<String?> by lazy {
        MutableLiveData<String?>()
    }
    val carroModelo : MutableLiveData<String?> by lazy {
        MutableLiveData<String?>()
    }
    val carroPlaca : MutableLiveData<String?> by lazy {
        MutableLiveData<String?>()
    }
    var user : User? = null

    fun setStatusMsg(msg : String){
        statusMsg.value = msg
    }

    fun setCarro(car : Car){
        carroMarca.value = car.marca
        carroModelo.value = car.modelo
        carroPlaca.value = car.placa
    }
}