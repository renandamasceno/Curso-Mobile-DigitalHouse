package Aula06Funcoes

fun sum(num1:Int, num2:Int, num3:Int):Int{
    return num1+num2+num3
}

fun main(){
    print("Digite o primeiro numero: ")
    var num1 = readLine()!!.toInt()
    print("Digite o segundo numero: ")
    var num2 = readLine()!!.toInt()
    print("Digite o terceiro numero: ")
    var num3 = readLine()!!.toInt()

    println("O resultado da soma desses 3 números é: ${sum(num1,num2,num3)}")
}