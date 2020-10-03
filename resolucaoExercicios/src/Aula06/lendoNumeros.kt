package Aula06

const val pergunta = "Digite um numero: "

fun main() {
    val numeros = arrayListOf<Int>()


    for (i in 1..5) {
        print(pergunta)
        var numDigitado: Int = readLine()!!.toInt()
        numeros.add(numDigitado)

    }
    println("A lista de numero digitados é a seguinte: $numeros")
}