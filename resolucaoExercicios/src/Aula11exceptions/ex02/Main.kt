package Aula11exceptions.ex02

fun main() {
    val calculoMatematico = CalculoMatematico()

    //calculoMatematico.divisao(4,0)

//    try {
//        calculoMatematico.divisao(4,0)
//
//    } catch (ex: kotlin.ArithmeticException){
//        println("Operação não pode ser realizada")
//        return 0
//    }
//    return 0
    try {
        calculoMatematico.divisao(4,0)
    } catch (ex:ArithmeticException){

    }
}