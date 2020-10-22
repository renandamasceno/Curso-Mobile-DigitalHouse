package exerciciosEstrutuaKotlin
/*
Escrever um código que deve analisar quatro números inteiros e, caso numA
seja maior que numC e numD ou caso numB seja maior que numC e numD,
retornar true, caso contrário, retornar false.

 */

fun main() {
    val numeros = arrayListOf<Int>()
    for (i in 1..4) {
        print("Digite o ${i}º numero: ")
        var num = readLine()!!.toInt()
        numeros.add(num)
    }
    println(maior(numeros))

}

fun maior(num: ArrayList<Int>): Boolean {
    return (num[0] > num[2] && num[0] > num[3]) || (num[1] > num[2] && num[1] > num[3])
}