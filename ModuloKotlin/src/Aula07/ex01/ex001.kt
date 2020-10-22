package Aula07.ex01

import Aula07.ex01.Cliente
import Aula07.ex01.Conta

fun main() {
    val nome1 = Cliente("José", "Renan")
    val conta1 = Conta(1234, 3200.00f, nome1)
    conta1.deposito(100.0f)
    conta1.saque(200.0f)

    val nome2 = Cliente("Carlos", "Eduardo")
    val conta2 = Conta(1234, 3200.00f, nome2)
    conta2.deposito(100.0f)
    conta2.saque(200.0f)

}