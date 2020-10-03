package Aula06Funcoes

fun resultado(numDigitado:Int):String{
    if(numDigitado > 0) return "Numero Positivo"
    else return "Numero Negativo"
}

fun main() {
    print("Digite um número: ")
    var num = readLine()!!.toInt()
    print("${resultado(num)} ")
}