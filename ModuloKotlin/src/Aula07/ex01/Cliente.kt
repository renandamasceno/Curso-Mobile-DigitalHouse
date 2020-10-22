package Aula07.ex01

class Cliente(nome: String, sobrenome: String) {
    val nomeCompleto: String

    init {
        nomeCompleto = "$nome $sobrenome"
    }
}