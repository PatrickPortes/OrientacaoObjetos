package classes

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info()= println("$nome    $numero")
}
