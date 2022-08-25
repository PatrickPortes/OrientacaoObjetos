class Pessoa {

    var nome: String = "Patrick"
    var cpf: String = "000.000.000-01"
        private set

    inner class Endereco{

        var rua: String = "Rua Japao"
    }



}

fun main(){

    val patrick = Pessoa()

    println(patrick.nome)
    println(patrick.cpf)
    println(patrick.Endereco().rua)


}