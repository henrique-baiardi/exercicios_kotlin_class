package Exercicio01

//metodo publico
fun main(){

    //metodo 1
    val usuario1 = Pessoa(nome = "Henrique",
                         diaEMesNiver = "05 de Abril",
                         anoNascimento = 1994,
                         altura = 1.86 )

    println(" ")
    exibirDados(usuario1, calcIdade(usuario1.getAno()))
//    println(usuario1)
}
fun calcIdade(valor: Int):Int{
    return 2020 - valor
//    val anos:Int = 2020 - usuario1.anoNascimento
}
fun exibirDados(usuario1: Pessoa, idade:Int){
    println("  ${usuario1.getName()} nasceu em " +
            "${usuario1.getAno()}," +
            " tem $idade" +
            " anos e possui ${usuario1.getAltura()}m de altura.")
}
data class Pessoa( private val nome:String,
                   private val anoNascimento: Int,
                   private val diaEMesNiver:String,
                   private val altura:Double){
    //atributos publicos
    fun getName() : String {
        return "$nome"
    }
    fun getAno() : Int {
        return anoNascimento
    }
    fun getDia() : String {
        return "$diaEMesNiver"
    }
    fun getAltura() : String {
        return "$altura"
    }
}
