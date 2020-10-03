package Aula10.exercicio02

import kotlin.math.max

class Item(
        val numeroItem: Int,
        val descricao: String,
        var quantidade: Int,
        var precoUnitario: Double) {

    init {
        quantidade = max(0,quantidade)
        precoUnitario = max(0.0,precoUnitario)
    }

}