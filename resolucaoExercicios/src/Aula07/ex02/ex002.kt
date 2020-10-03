package Aula07.ex02

fun main(){
    var jogadorUm = JogadorDeFutebol("Ricardo", 10, 15,3,10)
    var jogadorDois = JogadorDeFutebol("Paulo", 25, 0,2,5)

    var treinamento = SessaoDeTreinamento(5)
    treinamento.treinarA(jogadorUm)
    treinamento.treinarA(jogadorDois)
}