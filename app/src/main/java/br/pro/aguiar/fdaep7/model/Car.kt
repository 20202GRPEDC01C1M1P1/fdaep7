package br.pro.aguiar.fdaep7.model

class Car(
    var marca: String,
    var modelo: String,
    var placa: String
) {
    override fun toString(): String {
        return "${modelo} (${marca})"
    }
}