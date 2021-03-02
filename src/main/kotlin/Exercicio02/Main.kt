package Exercicio02

//agenda de contatos
//armazenar 10 contatos
class Contato(var nome:String? = "", var telefone:String? = "")

fun main() {
    println("-----Contatos:-----")
    println("01 - Add contato")
    println("02 - Remover contato")
    println("03 - Pesquisar contato")
    println("04 - Lista de contatos")
    println("05 - Sair")
    var opcao: String? = ""
    opcao = readLine()

    var listaContatos: MutableList<Contato> = mutableListOf()
//    var contato = Contato()

    while (opcao != "5") {
        when (opcao) {
            "1" -> {
                opcao = salvarContato(listaContatos, opcao)
            }
            "2" -> {
                opcao = removerContato(listaContatos, opcao)
            }
            "3" ->{
                opcao = buscarContato(listaContatos, opcao)
            }
            "4" -> {
                opcao = listarContatos(listaContatos, opcao)
            }
            "5" -> println("Saindo...")
            else -> {
                print("Comando incorreto")
                break
            }
        }
    }

}

private fun listarContatos(
    listaContatos: MutableList<Contato>,
    opcao: String?
): String? {
    var opcao1 = opcao
    println("Lista de contatos contatos:")
    for (contato in listaContatos) {
        println("${contato.nome}, ${contato.telefone}")
    }
    opcao1 = exibirMenu(opcao1)
    return opcao1
}

private fun buscarContato(
    listaContatos: MutableList<Contato>,
    opcao: String?
): String? {
    var opcao1 = opcao
    println("Buscar contato:")
    println("Digite o nome que deseja encontrar: ")
    var buscar = readLine().toString()
//                var pesquisa = listaContatos.filter { y -> y.nome.contains(buscar, true) }
    var pesquisa = listaContatos.filter { y -> y.nome == buscar }
    var contador = 0

//                var localizar = listaContatos.filter { contato.nome == this.nome }
//                var buscaContatoCad = agenda.filter { it.contatoNome == this.nome }

    for (contato in pesquisa) {
        contador++
        println("${contato.nome}, ${contato.telefone}")
    }

    println("Foram encontrados ${contador} resultados!")
    opcao1 = exibirMenu(opcao1)
    return opcao1
}

private fun removerContato(
    listaContatos: MutableList<Contato>,
    opcao: String?
): String? {
    var opcao1 = opcao
    println("Remover contato:")
    println("")
    println("Inserir Nome e Numero:")
    println("Nome:")
    var selecionado = readLine().toString()
    var pesquisa = listaContatos.filter { it.nome == selecionado }//retorna um lista de tudo que deu true//x -> x.nome

    println("Numero:")

    if (pesquisa.count() > 0) {
        if (pesquisa.count() == 1) {
            listaContatos.remove(pesquisa[0])
            println("Contato removido com sucesso!")
        } else {
            println("Foram encontrados multiplos contatos!")
        }
    } else {
        println("Contato nao existente!")
    }
    opcao1 = exibirMenu(opcao1)
    return opcao1
}

private fun salvarContato(
    listaContatos: MutableList<Contato>,
    opcao: String?
): String? {
    var opcao1 = opcao
    println("salvar contato:")
    if (listaContatos.size <= 9) {
        for (i in 1..1) {
            var contato = Contato()

            println("Digite o nome do $i° contato: ")
            contato.nome = readLine().toString()

            println("Digite o numero do $i° contato: ")
            contato.telefone = readLine().toString()

            //var contato = Contato(nome,numero)
            listaContatos.add(contato)
        }
    }else{
        println("A lista de contatos esta cheia!")
    }
    opcao1 = exibirMenu(opcao1)
    return opcao1
}

private fun exibirMenu(opcao: String?): String? {
    var opcao1 = opcao
    println("")
    println("")
    println("O que deseja fazer?")
    println("1-cadastrar,2-remover,3- buscar,4-ver lista, 5-sair")
    opcao1 = readLine()
    return opcao1
}
