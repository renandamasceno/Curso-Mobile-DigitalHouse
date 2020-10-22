package Aula06

fun main() {
    val alturas = arrayListOf<Float>()

    for (i in 1..5) {
        print("Digite a altura da pessoa ${i}:")
        var haltura = readLine()!!.toFloat()
        alturas.add(haltura)
    }
    alturas.reverse()
    println("A altura das pessoas na ordem inversa é: $alturas")


}