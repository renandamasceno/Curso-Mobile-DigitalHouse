package Aula08

fun main() {
    val contaCorrente = ContaCorrente(1234, 1250.00, 15.00)
    contaCorrente.depositar(1000.00)
    contaCorrente.sacar(250.00)

    val contaPoupanca = contaPoupanca(4321, 10000.00, 1000.00)
    contaPoupanca.depositar(500.0)
    contaPoupanca.sacar(11000.0)

    val relatorio = Relatorio()
    relatorio.gerarRelatorio(contaCorrente)
    relatorio.gerarRelatorio(contaPoupanca)
}