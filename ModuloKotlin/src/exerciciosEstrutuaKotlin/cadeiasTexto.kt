package exerciciosEstrutuaKotlin

/*
Escrever o código que deve analisar duas cadeias de texto e, caso sejam
diferentes, retornar true, ou, caso sejam iguais, retornar false.
*/
fun main() {
    print("Digite a primeira cadeia de texto: ")
    var textoUm = readLine()
    print("Digite a segunda cadeia de texto: ")
    var textoDois = readLine()

    if (textoUm != textoDois) println(true)
    else println(false)
}