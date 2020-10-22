fun main(args: Array<String>) {

    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toInt()

    var excedente = peso - 50
    var multa:Float = 4 * excedente.toFloat()

    println("Excedeu ${excedente}Kg")
    println("O valor a ser pago é de R$ $multa")
}