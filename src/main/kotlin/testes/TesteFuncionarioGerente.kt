package testes

import model.Analista
import model.Funcionario
import model.Gerente

fun main(){

    val vanessa = Gerente(nome="Vanessa Silva", cpf= "321.321.321-21", salario= 3400.0)
    ImprimirRelatorioFuncionario.imprimir(vanessa)

}

//fun imprimirRelatorio(funcionario: Funcionario) = println(funcionario.toString())