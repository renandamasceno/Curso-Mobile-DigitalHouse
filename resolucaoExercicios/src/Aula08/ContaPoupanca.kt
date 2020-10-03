package Aula08

class contaPoupanca(
        conta: Int,
        saldo: Double,
        private val limite: Double,
) : ContaBancaria(conta, saldo) {

    override fun sacar(quantia: Double): Boolean {
        if (quantia >= saldo) {
            saldo -= quantia
            return true
        } else if (quantia < saldo && quantia >= limite) {
            saldo -= quantia
            return true
        } else {
            println("O saque não pode ser realizado")
            return false
        }
    }

    override fun depositar(quantia: Double): Boolean {
        saldo += quantia
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: $limite")

    }
}