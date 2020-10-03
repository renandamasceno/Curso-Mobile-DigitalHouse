package Aula11.ex04

fun main(args: Array<String>) {
    val func1 = Funcionario("Renan", 123)
    val func2 = Funcionario("Felipe", 124)
    val func3 = Funcionario("Lucas", 125)
    val func4 = Funcionario("Gabriel", 126)

    val listaFuncionario = arrayListOf<Funcionario>(func1, func2, func3, func4)
    val func5 = Funcionario("Renan", 123)
    println(listaFuncionario.contains(func5))

}
