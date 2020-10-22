package Aula11exceptions.ex02

class CalculoMatematico {

    fun divisao(dividendo: Int, divisor: Int): Int {
        if (divisor != 0) {
            return dividendo / divisor
        } else {
            throw Exception("ArithmeticException")
        }


    }
}