package Aula08

class Banco : Imprimivel {
    private val contas = ArrayList<ContaBancaria>()

    fun inserir(conta: ContaBancaria) {
        contas.add(conta)
    }

    fun remover(conta: ContaBancaria) {
        contas.remove(conta)
    }

    override fun mostrarDados() {
        contas.forEach {
            it.mostrarDados()
            println()
        }
    }


    fun procurarConta(numConta: Int): ContaBancaria? {
        for (conta in contas) {
            if (conta.numeroDaConta == numConta) return conta
        }
        return null

    }
}