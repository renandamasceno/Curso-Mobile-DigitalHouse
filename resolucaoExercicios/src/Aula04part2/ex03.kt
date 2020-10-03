package Aula04part2
fun main(args: Array<String>) {

    print("Digite a primeira nota do aluno: ")
    var nota1 = readLine()!!.toDouble()
    print("Digite a segunda nota do aluno: ")
    var nota2 = readLine()!!.toDouble()

    var media = (nota1+nota2)/2

    if(media == 10.0 ) {
        println("Aprovado com Distinção")
    } else if(media < 7) {
        println("Reprovado")
    } else {
        println("Aprovado")
    }
}