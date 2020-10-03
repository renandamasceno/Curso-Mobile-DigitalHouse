package Aula07.ex04

class Carro(var consumo: Int) {
    var nivelCombustivel = 0;

    fun adicionarGasolina(add: Int) {
        nivelCombustivel = add
    }

    fun andar(distancia: Int) {
        nivelCombustivel = distancia / consumo
    }

    fun obterGasolina() {
        println(nivelCombustivel)
    }

}