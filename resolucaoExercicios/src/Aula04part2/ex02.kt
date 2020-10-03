package Aula04part2

fun main(args: Array<String>) {

    print("Digite um número: ")
    var num = readLine()!!.toInt()

    if(num % 2 == 0) {
        println("O número digitado é PAR!")
    } else {
        println("O número digitado é ÍMPAR!")
    }

}