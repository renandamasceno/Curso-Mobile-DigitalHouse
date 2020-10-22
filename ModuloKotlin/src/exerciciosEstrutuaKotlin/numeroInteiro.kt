package exerciciosEstrutuaKotlin

/*
* Escrever o código que deve analisar um número inteiro e, caso ele seja par,
* retornar true, caso contrário, retorna false
*/

fun main() {
    print("Escreva um número para saber se é verdadeiro que ele é par: ")
    val numero = readLine()!!.toInt()
    println(inteiro(numero))
}

fun inteiro(numero: Int): Boolean {
    return numero % 2 == 0
}