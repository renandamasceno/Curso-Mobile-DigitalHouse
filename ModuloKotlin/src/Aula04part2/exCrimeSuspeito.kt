package Aula04part2

fun main(args: Array<String>) {

    var contador = 0;

    println("Você é Suspeito de um crime responda as perguntas a seguir com S para sim ou N para não.")
    print("Telefonou para a vítima? ")
    var question = readLine()!!.toLowerCase()
    if(question == "s"){
        contador++
    }
    print("Esteve no local do crime? ")
    question = readLine()!!.toLowerCase()
    if(question == "s"){
        contador++
    }
    print("Mora perto da vítima? ")
    question = readLine()!!.toLowerCase()
    if(question == "s"){
        contador++
    }
    print("Devia para a vítima? ")
    question = readLine()!!.toLowerCase()
    if(question == "s"){
        contador++
    }
    print("Já trabalhou com a vítima? ")
    question = readLine()!!.toLowerCase()
    if(question == "s"){
        contador++
    }

    if(contador == 5) {
        println("Assasino")
    } else if(contador >=3 && contador <=4 ) {
        println("Cúmplice")
    } else if(contador == 2) {
        println("Suspeita")
    } else {
        println("Inocente")
    }
}