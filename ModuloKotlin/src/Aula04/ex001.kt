
fun main(args: Array<String>) {

    print("Digite a primeira nota: ")
    var nota1:Float = readLine()!!.toFloat();
    print("Digite a segunda nota: ")
    var nota2:Float = readLine()!!.toFloat();
    print("Digite a terceira nota: ")
    var nota3:Float = readLine()!!.toFloat();
    print("Digite a quarta nota: ")
    var nota4:Float = readLine()!!.toFloat();

    var media:Float = (nota1+nota2+nota3+nota4) / 4
    print("A média dessas notas é: $media")
}