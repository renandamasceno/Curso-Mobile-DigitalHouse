fun main(args: Array<String>) {

    print("Quanto vale sua hora? ")
    var valorHora = readLine()!!.toFloat()

    print("Quantas horas você trabalhou? ")
    var horasTrabalhadas = readLine()!!.toFloat()

    print("Você receberá R$ ${valorHora*horasTrabalhadas}")

}