package testes

import classes.ClienteTipo
import model.Cliente

fun main(){

    val jennifer = Cliente(
        nome = "Jennifer",
        cpf = "123456654-12",
        clienteTipo = ClienteTipo.PF,
        senha = "senha123")

    println(jennifer)

    TesteAutenticacao().autenticacao(jennifer)


}