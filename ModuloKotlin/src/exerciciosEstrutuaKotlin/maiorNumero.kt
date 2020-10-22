package exerciciosEstrutuaKotlin
/*
Escrever o código que deve analisar três números inteiros e retornar o maior
deles.
*/

fun main() {

    var MAX = Int.MIN_VALUE

    for (i in 1..3) {
        print("Digite o ${i}º número: ")
        var digitado = readLine()!!.toInt()
        if (digitado > MAX) MAX = digitado

    }
    println("O maior número digitado foi: $MAX")

}