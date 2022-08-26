package testes

import classes.Banco

fun main(){

    val firstBank = Banco( nome= "LawBank", numero= 23)

    println(firstBank.nome)
    println(firstBank.numero)

    val banco2 = firstBank.copy(nome="BancoDois", numero= 46)

    println(banco2.info())

}