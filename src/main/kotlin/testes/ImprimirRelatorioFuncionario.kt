package testes

import model.Funcionario

class ImprimirRelatorioFuncionario {

    companion object{
        fun imprimir(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}