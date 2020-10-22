package Aula05

fun main(args: Array<String>) {

    print("Digite a quantidade de notas que deseja tirar a media: ")
    var N = readLine()!!.toInt()

    var nLido = 0.0F
    var sum = 0.0F

    for(i in 1..N) {
        print("Digita a nota ${i}: ")
        nLido = readLine()!!.toFloat()
        sum+=nLido
    }
    var media = sum/N
    println("A média das $N notas lidas é: $media")
}