package Aula08

class ContaCorrente(
        conta: Int,
        saldo: Double,
        private val taxaDeOperacao: Double,
) : ContaBancaria(conta, saldo) {
    override fun sacar(quantia: Double): Boolean {
        if (quantia + taxaDeOperacao <= saldo) {
            saldo -= (quantia + taxaDeOperacao)
            return true
        } else {
            println("Saldo Insuficiente")
            return false
        }

    }

    override fun depositar(quantia: Double): Boolean {
        if ((quantia + saldo) >= taxaDeOperacao) {
            saldo += (quantia - taxaDeOperacao)
            return true
        } else {
            println("impossivel depositar")
            return false
        }

    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de Operação: $taxaDeOperacao")
    }


}