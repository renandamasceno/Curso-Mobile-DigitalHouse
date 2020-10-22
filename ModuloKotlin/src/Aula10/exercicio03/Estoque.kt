package Aula10.exercicio03

import java.lang.Exception

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {


    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(Minima: Int) {
        if (qtdMinima < 0) {
            throw Exception("Quantidade não poderá ser negativa")
        }
        qtdMinima = Minima
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        if (qtdAtual < 0) {
            throw Exception("Quantidade não poderá ser negativa")
        }
        qtdAtual -= qtd
    }

    fun mostrar(): String = "Nome: $nome\nQuantidade Mínima: ${qtdMinima}\nQuantidadeAtual: $qtdAtual"


    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }

}