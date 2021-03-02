package Exercicio03

//O ideal eh ter mais um classe pai funcionarios
class Funcionarios(var nome:String? ="",
                   var id:String? ="",
                   var cpf:String? ="",
                   var salario:Double? = 0.0,
                   var tipoFuncionario:String ="")

//class Programador(var nome:String? ="", var id:String? ="",var cpf:String? ="", var salario:Double? = 0.0)
//class Gestor(var nome:String? ="", var id:String? ="",var cpf:String? ="", var salario:Double? = 0.0)

fun main() {

    //main ADD
    println("Digite o nome do funcionário:")
    var nome = readLine()
    println("Digite o id do funcionário:")
    var id = readLine()
    println("Digite o CPF do funcionário:")
    var cpf = readLine()
    println("Digite o Salario atual do funcionário:")
    var salario = readLine()?.toDouble()
    println("Digite seu cargo: (1)gestor ou (2)programador ")
    var cargo = readLine()

//    var listaProgramadores:MutableList<Programador> = mutableListOf()
//    var listaGestores:MutableList<Gestor> = mutableListOf()
    var listaFuncionarios:MutableList<Funcionarios> = mutableListOf()

    if (cargo != "1" && cargo != "2"){
        println("Valor invalido")
    }else {
        var funcionarios = Funcionarios(nome,id,cpf,salario,cargo)

        listaFuncionarios.add(funcionarios)
    }

    //FIM main ADD

    //Main pesquisar

    println("Digite o ID do funcionario:")
    var selecionado = readLine()

    var pesquisa = listaFuncionarios.filter { it.id == selecionado}

    while (pesquisa.count() == 0){
        println("Id nao encontrado...")
        println("Digite o ID do funcionario:")
        selecionado = readLine()

        pesquisa = listaFuncionarios.filter { it.id == selecionado}
    }
    println("1- Exibir seus Dados | 2 - Aumentar Salario")
    var resposta = readLine()
//    if ()
//    for (func in pesquisa) {
//        println("${func.nome}, ${func.id}, ${func.cpf}, ${func.tipoFuncionario}, ${func.salario}")
//    }



}