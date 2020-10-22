package Aula05

fun main(args: Array<String>) {

    print("Digite um numero de 1 até 10 para gerar uma tabuada: ")
    var num = readLine()!!.toInt()

    println("Tabuada de ${num}:")

    for(i in 1..10) {
        println("$num X $i = ${num*i}")

    }
}