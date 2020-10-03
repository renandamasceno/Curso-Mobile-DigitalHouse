package Aula08

import kotlin.random.Random
val banco = Banco()
fun main() {


    do {
        val opcaoMenu = menuPrincipal()

        when (opcaoMenu) {
            1 -> submenu1()
            2 -> submenu2()
            3 -> submenu3()
            4 -> submenu4()
            5 -> break
        }

    } while (opcaoMenu != 5)

}



fun menuPrincipal(): Int {
    println()
    println("1 - Criar Conta")
    println("2 - Selecionar Conta")
    println("3 - Remover Conta")
    println("4 - Gerar Relatório")
    println("5 - Terminar a Aplicação")
    println()
    return readLine()!!.toInt()
}

fun submenu1() {
    println()
    println("Informe a sua conta:")
    println("a - Conta Corrente")
    println("b - Conta Poupanca")
    println()

    val tipoConta = readLine()
    var contaCriada: ContaBancaria? = null

    when (tipoConta) {
        "a" -> ContaCorrente(Random.nextInt(),0.0,0.0)
         "b" -> contaPoupanca(Random.nextInt(), 0.0,5.00)
    }
    banco.inserir(contaCriada!!)

}

fun submenu2() {
    println()
    print("Informe o numero da conta que deseja procurar: ")
    val numeroConta = readLine()!!.toInt()
    val contaEncontrada = banco.procurarConta(numeroConta)

    if(contaEncontrada != null){
        menu2()
        val numLido = readLine()
        when(numLido){
            "a" -> menu2Deposito(contaEncontrada)
            "b" -> menu2Sacar(contaEncontrada)
            "c" -> menu2Transferir()
            "d" -> contaEncontrada.mostrarDados()
            //"e" -> break
        }


    } else {
        println("Conta não encontrada")
    }
    println()
}

fun menu2(){
    println()
    println("a - Depositar")
    println("b - Sacar")
    println("c - Transferir")
    println("d - Gerar Relatório")
    println("e - Retornar ao menu anterior")
    println()
}

fun menu2Deposito(contaBancaria: ContaBancaria) {
    print("Digite a quantia que deseja depositar: ")
    val quantia:Double = readLine()!!.toDouble()
    contaBancaria.depositar(quantia)
}
fun menu2Sacar(contaBancaria: ContaBancaria) {
    print("Digite a quantia que deseja sacar: ")
    val quantia:Double = readLine()!!.toDouble()
    contaBancaria.sacar(quantia)
}
fun menu2Transferir() {

}

fun submenu3() {
    println()
    print("Informe o numero da conta que deseja remover: ")
    val numeroConta = readLine()!!.toInt()
    val contaEncontrada = banco.procurarConta(numeroConta)

    if(contaEncontrada != null){
        banco.remover(contaEncontrada)
    } else {
        println("Conta não encontrada")
    }
    println()
}

fun submenu4() {


}