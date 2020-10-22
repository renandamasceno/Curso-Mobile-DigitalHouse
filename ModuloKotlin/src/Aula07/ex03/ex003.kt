package Aula07.ex03

fun main() {
    val competidorUm = Atleta("Felipe",25,15)
    val competidorDois = Atleta("Gabriel",35,10)

    val p1 = Prova(15,10)
    val p2 = Prova(25, 5)
    val p3 = Prova(30,10)

    println(p1.realizarProva(competidorUm))
    println(p2.realizarProva(competidorUm))
    println(p3.realizarProva(competidorUm))

    println(p1.realizarProva(competidorDois))
    println(p2.realizarProva(competidorDois))
    println(p3.realizarProva(competidorDois))

}