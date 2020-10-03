package Aula06Funcoes

import kotlin.random.Random

fun main() {
    var jogadasFeitas = 0;
    while (true) {
        print("rolar dados? (s ou n): ")
        var read = readLine()!!.toLowerCase()
        jogadasFeitas++
        if (read == "n") break
        var numGerado = dados()

        if ((numGerado == 7 || numGerado == 11) && jogadasFeitas == 1) {

            println("Você tirou ${numGerado}! Parabéns você ganhou! jogue novamente")
            jogadasFeitas = 0

        } else if ((numGerado == 2 || numGerado == 3 || numGerado == 12) && jogadasFeitas == 1) {

            println("Você tirou ${numGerado}! Craps! você perdeu, tente novamente ")
            jogadasFeitas == 0

        } else if ((numGerado == 4 || numGerado == 5 || numGerado == 6 || numGerado == 8 || numGerado == 9 || numGerado == 10) && jogadasFeitas == 1) {
            var ponto = numGerado
            while (true) {
                print("rolar dados? (s ou n): ")
                print("Você tirou ${numGerado}! Aperte enter para tentar novamente ")

                read = readLine()!!.toString()

                numGerado = dados()
                if (numGerado == 7) {
                    println("Você tirou ${numGerado}! você perdeu =( tente novamente")

                    break
                } else if (numGerado == ponto) {
                    println("Você tirou ${numGerado} de novo! Parabéns você venceu! ")
                    break
                }

            }


        }
        jogadasFeitas = 0
    }


}

fun dados(): Int {
    return Random.nextInt(2, 12)
}
