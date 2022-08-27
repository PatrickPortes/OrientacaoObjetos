package testes

import interfaces.Login

class TesteAutenticacao {

    fun autenticacao(autentica: Login) = println(autentica.logar())
}