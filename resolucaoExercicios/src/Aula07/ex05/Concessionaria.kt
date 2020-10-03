package Aula07.ex05

fun main() {
    val carro = Veiculo("BMW", "X6", 2015, "branco", 0)
    val cliente = Cliente("José", "Renan", "85981533234")
    val venda = Venda(250000.00, carro, cliente)

    registrarVenda(carro, cliente, venda)

}

fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Venda) {
    println("Cliente: ${cliente.nome + " " + cliente.sobrenome}")
    println("Carro vendido: ${veiculo.marca} modelo: ${veiculo.modelo}")

}