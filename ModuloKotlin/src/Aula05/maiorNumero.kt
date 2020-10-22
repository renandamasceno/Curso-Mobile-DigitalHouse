package Aula05

fun main(args: Array<String>) {

    var MAX = Int.MIN_VALUE
    var numlido = 0
    println("A seguir digite 5 números para saber qual o maior digitado!")
    for (i in 1..5) {
        print("Digite o $i numero: ")
        numlido = readLine()!!.toInt()
        if(numlido > MAX){
            MAX = numlido
        }
    }
    println("O maior numero lido foi o $MAX")


}