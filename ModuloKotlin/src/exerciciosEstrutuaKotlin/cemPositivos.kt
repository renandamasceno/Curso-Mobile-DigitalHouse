package exerciciosEstrutuaKotlin

/*
*Escrever um programa que imprima na tela os primeiros 100 números
*inteiros positivos ímpares.
*/

fun main() {
    var contador = 0
    var num = 1

    while (contador != 100) {

        if (num % 2 != 0) {
            println(num)
            contador++
        }
        num++

    }


}


