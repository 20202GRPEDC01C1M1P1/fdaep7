package br.pro.aguiar.fdaep7.repository

import br.pro.aguiar.fdaep7.model.Car

object Cars {
    var carros = listOf(
        Car("VW", "Fusca", "tpz5t54"),
        Car("Ford", "Fiesta", "gts5g62"),
        Car("Fiat", "Uno", "fgd2e45")
    )

    fun all() : List<Car> {
        return carros
    }

    fun get(i: Int): Car {
        return carros.get(i)
    }
}