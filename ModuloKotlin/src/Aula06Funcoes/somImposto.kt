package Aula06Funcoes

fun somaImposto(taxaImposto: Int, custo: Float): Float {

    return custo + ((taxaImposto / 100F) * custo)

}

fun main() {
    print("Digite o custo do produto: ")
    val produto = readLine()!!.toFloat()
    print("Digite a taxa de imposto em %: ")
    val taxa = readLine()!!.toInt()

    println("O valor real do produto é: ${somaImposto(taxa,produto)}")
}
