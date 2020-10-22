package Aula07.ex02

class SessaoDeTreinamento(var experiencia: Int) {

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol) {

        println("Experiencia inicial: $experiencia")
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        jogadorDeFutebol.Experiencia += experiencia
        println("Experiencia final: ${jogadorDeFutebol.Experiencia}")


    }
}