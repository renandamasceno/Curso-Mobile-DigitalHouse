package Aula12.agrupadorPorEstado

fun main(args: Array<String>) {
    val CE = Estado("CE","Ceará")
    val pessoa1 = Pessoa("José",CE )
    val SP = Estado("SP","São Paulo")
    val PE = Estado("SP","São Paulo")
    val pessoa2 = Pessoa("Paulo",SP )


    val pessoa3 = Pessoa("Renan",SP )

    val pessoas = listOf(pessoa1,pessoa2,pessoa3)

    val agrupamentoPorEstado = mutableMapOf<String,MutableList<Pessoa>>()

//    pessoas.forEach{
//        if(!agrupamentoPorEstado.containsKey(it.estado.sigla)) {
//            agrupamentoPorEstado[it.estado.sigla] = mutableListOf()
//        }
//        agrupamentoPorEstado[it.estado.sigla]?.add(it)
//    }

    pessoas.groupBy { it.estado.sigla }.toMutableMap()
    println(pessoas)
}