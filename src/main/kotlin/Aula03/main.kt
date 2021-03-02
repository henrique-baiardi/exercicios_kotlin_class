import Aula03.Carro
import Aula03.EnumTiposPokemon
import Aula03.Imovel
import Aula03.Livro

fun main(){
//    var reaLine : Int?
//    var scanner: Int?
//
//    println("Testa metodo readLine()")
//    reaLine = readLine()?.toIntOrNull()
//
//    println("Testando medodo Scanner")
//    scanner = Scanner(System.`in`).nextInt()
//
//    println(reaLine)
//    println(scanner)

    val livro1 = Livro(
        titulo = "Harry Potter e a pedra filosofal",
        autor = "J. K. Rowling",
        editora = "Saraiva",
        numeroPaginas = 200,
        seestaAlugado = true
    )
    val livro2 = Livro(
        titulo = "Harry Potter e camara secreta",
        autor = "J. K. Rowling",
        editora = "Saraiva",
        numeroPaginas = 220,
        seestaAlugado = true
    )

    println(livro1)
    println(livro1.titulo)

    livro1.titulo = "ola"

    println(livro1.titulo)

    println(livro1)

    var listaLivros : MutableList<Livro> = mutableListOf(livro1, livro2)

//    val resultado = Soma(2,2).somar()

    val carro1 = Carro(nome = "ABC", placa = "XPTO")
    val carro2 = Carro(nomeInserido = "DEF", placaInserida = "ABCD", modeloNovo = true)

    println("${carro1.nome}, ${carro1.placa}")

    //Só exibe de forma completa no log se for um data class!!
    println(carro1)

    val tipo = EnumTiposPokemon.FOGO

    val mensagem = when(tipo){
        EnumTiposPokemon.FOGO -> "Tá pegando fogo, bicho!"
        EnumTiposPokemon.DRAGAO -> "Dragão"
        else -> "Alguma coisa..."
    }

    println(mensagem)

    val casa = Imovel(valor = 350000.00, qtdQuartos = 2, endereco = "Onde judas perdeu as botas")
    val apartamento = Imovel(valor = 4600000.00, qtdQuartos = 5, endereco = "Também onde judas perdeu as botas", numeroAndares = 8)


}