package Aula06

const val perguntas = "Digite um numero: "

fun main() {
    val numeros = arrayListOf<Int>()


    for (i in 1..10) {
        print(perguntas)
        var numDigitado: Int = readLine()!!.toInt()
        numeros.add(numDigitado)

    }
    numeros.reverse()
    println("A lista inversa dos numeros digitados é a seguinte: $numeros")
}