package Aula06

fun main() {
    val notas = arrayOf(100, 50, 10, 5, 1)

    print("Digite o valor de saque: ")
    var saque = readLine()!!.toInt()
    var cedulas = 0


    for (i in 0..4) {
        cedulas = saque / notas[i]
        saque %= notas[i]
        println("$cedulas de ${notas[i]}")
    }

}