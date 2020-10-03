package Aula11.ex03

class Aluno(val nome:String, val numeroDoAluno: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numeroDoAluno != other.numeroDoAluno) return false

        return true
    }

    override fun hashCode(): Int {
        return numeroDoAluno
    }
}