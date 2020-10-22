package Aula04part2

fun main(args: Array<String>) {

    print("Informe o valor do Saque: ")
    var valor = readLine()!!.toInt()
    var notas = 0

    if(valor >= 100) {
        notas = valor / 100
        println("$notas de 100")
        valor %= 100
    }
    if(valor >= 50) {
        notas = valor / 50
        println("$notas de 50")
        valor %= 50
    }
    if(valor >= 10) {
        notas = valor / 10
        println("$notas de 10")
        valor %= 10
    }
    if(valor >= 5) {
        notas = valor / 5
        println("$notas de 5")
        valor %= 5
    }
    if(valor >= 1) {
        notas = valor / 1
        println("$notas de 1")
        valor %= 1
    }


}