package br.pro.aguiar.fdaep7.repository

import br.pro.aguiar.fdaep7.model.Car

object Cars {
    var carros = listOf(
        Car("VW", "Fusca", "tpz5t54"),
        Car("Ford", "Fiesta", "gts5g62"),
        Car("Fiat", "Uno", "fgd2e45"),
        Car("VW", "Fusca", "tpz5t54"),
        Car("Ford", "Fiesta", "gts5g62"),
        Car("Fiat", "Uno", "fgd2e45"),
        Car("VW", "Fusca", "tpz5t54"),
        Car("Ford", "Fiesta", "gts5g62"),
        Car("Fiat", "Uno", "fgd2e45"),
        Car("VW", "Fusca", "tpz5t54"),
        Car("Ford", "Fiesta", "4gs5g62"),
        Car("Fiat", "Uno", "fgd4g45"),
        Car("VW", "Fusca", "tp4gt54"),
        Car("Ford", "Fiesta", "gss5g62"),
        Car("Fiat", "Uno", "fgd2s45"),
        Car("VW", "Fusca", "tpz5s54"),
        Car("Ford", "Fiesta", "gts5g62"),
        Car("Fiat", "Uno", "fgd2e45"),
        Car("VW", "Fusca", "tpzst54"),
        Car("Ford", "Fiesta", "gts5g62"),
        Car("Fiat", "Uno", "fgs2e45"),
    )

    fun all() : List<Car> {
        return carros
    }

    fun get(i: Int): Car {
        return carros.get(i)
    }
}