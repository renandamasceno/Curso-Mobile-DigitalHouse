package Aula05

fun main(args: Array<String>) {

    print("Digite a quantidade total de CDs: ")
    var totalCds = readLine()!!.toInt()

    var valorCd = 0.0F
    var soma = 0.0F
    for(i in 1..totalCds) {
        print("Digite o valor do CD ${i}: ")
        valorCd = readLine()!!.toFloat()
        soma+=valorCd
    }
    var media:Float = (soma / totalCds)

    println("Valor Total gasto na coleção: R$ $soma")
    println("Valor Médio gasto nos CDs: R$ $media")
}