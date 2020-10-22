package Aula05

import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {

    print("Digite o primeiro numero: ")
    var num1 = readLine()!!.toInt()
    print("Digite o segundo numero: ")
    var num2 = readLine()!!.toInt()

    for (i in min(num1,num2)..max(num1,num2)){
        println(i)
    }

}