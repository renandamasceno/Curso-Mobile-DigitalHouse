package Aula08

abstract class ContaBancaria(protected val conta: Int, protected var saldo: Double) : Imprimivel {

    abstract fun sacar(quantia: Double): Boolean
    abstract fun depositar(quantia: Double): Boolean

    val numeroDaConta get() = conta

    override fun mostrarDados() {
        println("Conta: $conta")
        println("Saldo: $saldo")

    }

    fun transferir(valor: Double, destino: ContaBancaria) {
        var saldoOrigem = saldo

        if (!sacar(valor) || !destino.depositar(valor)) {
            println("Não foi possivel realizar a transferencia")
        } else{
            println("Transferencia Realizada")
        }

    }
}