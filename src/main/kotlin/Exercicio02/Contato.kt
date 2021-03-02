package Exercicio02

abstract class Funcionario(var ID: String? ="", var name: String? ="", var CPF: String? ="", var salary: Double? = 0.0)

class Gestor() : Funcionario() {

     fun novoSalario(){
         salary = salary?.times(1.1)
    }
}

class Programador() : Funcionario() {

     fun novoSalario(){
         salary = salary?.times(1.2)
    }
}
fun main() {

    //main ADD
    println("Digite o id do funcionário:")
    var id = readLine()
    println("Digite o nome do funcionário:")
    var nome = readLine()
    println("Digite o CPF do funcionário:")
    var cpf = readLine()
    println("Digite o Salario atual do funcionário:")
    var salario = readLine()?.toDouble()
    println("Digite seu cargo: (1)gestor ou (2)programador ")
    var cargo = readLine()

//    var listaProgramadores:MutableList<Programador> = mutableListOf()
//    var listaGestores:MutableList<Gestor> = mutableListOf()
    var listaFuncionarios:MutableList<Any> = mutableListOf()

    if (cargo != "1" && cargo != "2"){
        println("Valor invalido")
    }else if(cargo == "1"){
        var gestor = Gestor()
        gestor.ID = id
        gestor.name = nome
        gestor.CPF = cpf
        gestor.salary = salario

        listaFuncionarios.add(gestor)

    }else if (cargo == "2"){
        var programador = Gestor()
        programador .ID = id
        programador .name = nome
        programador .CPF = cpf
        programador .salary = salario

        listaFuncionarios.add(programador)
    }

    //FIM main ADD

    //Main pesquisar

    println("Digite o ID do funcionario:")
    var selecionado = readLine()

    var pesquisa = listaFuncionarios.filter { it}

    while (pesquisa.count() == 0){
        println("Id nao encontrado...")
        println("Digite o ID do funcionario:")
        selecionado = readLine()

        pesquisa = listaFuncionarios.filter { it.id == selecionado}
    }
    println("1- Exibir seus Dados | 2 - Aumentar Salario")
    var resposta = readLine()
    if (resposta == "1") {
        for (func in pesquisa) {
            println("${func.nome}, ${func.id}, ${func.cpf}, ${func.tipoFuncionario}, ${func.salario}")
        }
    }



}