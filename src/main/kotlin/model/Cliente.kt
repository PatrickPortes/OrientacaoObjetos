package model

import classes.ClienteTipo
import interfaces.Login

class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String
    ) : Pessoa(nome, cpf), Login {

    override fun logar(): Boolean = "senha123" == senha

    override fun toString(): String = """
        Nome= $nome
        CPF= $cpf
        Tipo= ${clienteTipo.descricao}
    """.trimIndent()
}