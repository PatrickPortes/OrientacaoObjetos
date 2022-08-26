package testes

import model.Analista
import model.Funcionario

fun main(){

    val lucas = Analista(nome="Lucas Oliveira", cpf= "321.321.321-21", salario= 2000.0)
    ImprimirRelatorioFuncionario.imprimir(lucas)

}

//fun imprimirRelatorio(funcionario: Funcionario) = println(funcionario.toString())