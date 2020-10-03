package Aula11exceptions.ex01

import kotlin.test.currentStackTrace

fun main() {
    val lista = ArrayList<String>()

    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")

    try {
        println(lista[3])
    } catch (e: Exception){
        println(e.message)
        e.printStackTrace()
    }


}