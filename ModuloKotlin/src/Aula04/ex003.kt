fun main(args: Array<String>) {

    print("Digite a altura: ")
    var h = readLine()!!.toFloat()

    var homens = (72.7 * h) - 58
    var mulheres = (62.1 * h) - 44.7

    println("Para homens: $homens")
    println("Para mulheres: $mulheres")
}