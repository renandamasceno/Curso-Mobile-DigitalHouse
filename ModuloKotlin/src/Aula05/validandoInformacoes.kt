package Aula05

fun main(args: Array<String>) {

    println("Validando informações")

    print("Digite um nome maior que 3 caracteres: ")
    var nome = readLine()!!.toString()
    while (nome.length <= 3) {
        print("Nome Inválido, digite um nome com mais de 3 caracteres: ")
        nome = readLine().toString()
    }

    print("Digite sua idade: ")
    var idade = readLine()!!.toInt()
    while (idade < 0 || idade > 150) {
        print("Idade Inválida, digite uma idade entre 0 e 150: ")
        idade = readLine()!!.toInt()
    }

    print("Digite o valor do seu salario: ")
    var salario = readLine()!!.toFloat()
    while (salario < 0.0F) {
        print("Salário Inválido, digite um valor de salário maior que 0: ")
        salario = readLine()!!.toFloat()
    }

    while (true) {
        print("Digite F para feminino ou M para masculino: ")
        var sexo = readLine()!!.toLowerCase()
        if (sexo == "f" || sexo == "m") break
    }

    while (true){
        print("Digite um estado civil correto, sendo s,c,v ou d: ")
        var estadoCivil = readLine()!!.toLowerCase()
        if (estadoCivil == "s" || estadoCivil == "c" || estadoCivil == "v" || estadoCivil == "d") break
    }

    println("Cadastro Concluído, Obrigado!")
    
}