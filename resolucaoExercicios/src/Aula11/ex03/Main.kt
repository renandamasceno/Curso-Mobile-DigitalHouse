package Aula11.ex03


fun main() {
    val listaAlunos = arrayListOf<Aluno>()
    val aluno1 = Aluno("Renan",1)
    val aluno2 = Aluno("Felipe",2)
    val aluno3 = Aluno("Marcos",3)
    val aluno4 = Aluno("Rafael",4)

    listaAlunos.add(0,aluno1)
    listaAlunos.add(1,aluno2)
    listaAlunos.add(2,aluno3)
    listaAlunos.add(3,aluno4)

    print("Digite o nome do aluno novo: ")
    val nome = readLine()!!
    print("Digite o numero do aluno: ")
    val numero = readLine()!!.toInt()
    val novoAluno = Aluno(nome,numero)

    println("Este aluno pertence a turma? ${listaAlunos.contains(novoAluno)}")





}