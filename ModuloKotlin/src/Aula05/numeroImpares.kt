package Aula05

fun main(args: Array<String>) {
    println("Lista dos numeros impares entre 1 e 50")
    for(i in 1..50) {
        if( i % 2 != 0 ) {
            println(i)
        }
    }
}