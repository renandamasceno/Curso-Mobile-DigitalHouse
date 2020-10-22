package Aula07.ex01

import Aula07.ex01.Cliente

class Conta(numCOnta: Int, saldo: Float, cliente: Cliente) {
    val saldoAtual = saldo
    var novoValor = 0F

    fun deposito(quantia: Float) {
        println("Depósito realizado!")
        println("Novo Saldo da conta: ${saldoAtual + quantia}")
        novoValor = (saldoAtual + quantia)
    }

    fun saque(valorSaque: Float) {
        if (valorSaque > novoValor) {
            println("Saldo Insuficiente!")
        } else {
            println("Saque Realizado!")
            println("Novo Saldo da conta: ${novoValor - valorSaque}")
        }
    }
}