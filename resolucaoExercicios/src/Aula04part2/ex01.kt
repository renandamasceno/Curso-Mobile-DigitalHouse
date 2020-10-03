
package Aula04part2

fun main(args: Array<String>) {
    print("Digite M ou F para verificar o sexo: ")
    var sexo = readLine()!!.toLowerCase()

    if(sexo == "f"){
        println("Sexo Feminino")
    } else if(sexo == "m") {
        println("Sexo Masculino")
    } else {
        println("Sexo Inválido!")
    }
}