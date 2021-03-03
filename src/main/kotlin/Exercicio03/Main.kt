package Exercicio03

abstract class Funcionario(
    var id: String? = "",
    var name: String? = "",
    var cpf: String? = "",
    var salario: Double? = 0.0,
    var cargo: String? = ""
)
//
class Gestor() : Funcionario(),calcSalario {
    override fun aumentarSalario(salario: Double?): Double? {
        return salario?.times(1.1)
    }
}
class Programador() : Funcionario(),calcSalario {
    override fun aumentarSalario(salario: Double?): Double? {
        return salario?.times(1.2)
    }
}
//
interface calcSalario{
    fun aumentarSalario(salario:Double?):Double?
}
//
fun main() {

    //main ADD
    println("Digite o id do funcionário:")
    var id = readLine()
    println("Digite o nome do funcionário:")
    var nome = readLine()
    println("Digite o cpf do funcionário:")
    var cpf = readLine()
    println("Digite o Salario atual do funcionário:")
    var salario = readLine()?.toDouble()
    println("Digite seu cargo: (1)gestor ou (2)programador ")
    var cargo = readLine()


    var listaFuncionarios: MutableList<Funcionario> = mutableListOf()

    if (cargo != "1" && cargo != "2") {
        println("Valor invalido")
    } else if (cargo == "1") {
        var gestor = Gestor()
        gestor.id = id
        gestor.name = nome
        gestor.cpf = cpf
        gestor.salario = salario
        gestor.cargo = cargo

        listaFuncionarios.add(gestor)

    } else if (cargo == "2") {
        var programador = Gestor()
        programador.id = id
        programador.name = nome
        programador.cpf = cpf
        programador.salario = salario
        programador.cargo = cargo

        listaFuncionarios.add(programador)
    }
    //FIM main ADD

    //Main pesquisar

    println("Digite o id do funcionario:")
    var selecionado = readLine()
    var solucao: Any

    var pesquisa = listaFuncionarios.filter { it.id == selecionado }

    while (pesquisa.count() == 0) {
        println("Id nao encontrado...")
        println("Digite o id do funcionario:")
        selecionado = readLine()

        pesquisa = listaFuncionarios.filter { it.id == selecionado }
    }
    println("ID encontrado com sucesso!")

    println("1- Exibir seus Dados | 2 - Aumentar Salario")
    var opcao = readLine()

    when (opcao) {
        "1" -> {
            for (func in pesquisa) {
                println("ID: ${pesquisa[0].id}, Nome: ${pesquisa[0].name}, CPF: ${pesquisa[0].cpf}, R$${pesquisa[0].salario}, Cargo: ${pesquisa[0].cargo}")
                }
            }
        "2" -> {
            for (func in listaFuncionarios){
                if (selecionado == func.id){
                   if (func.cargo == "1"){
                       //listaFuncionarios[0].salario = listaFuncionarios[0].salario?.times(1.1)
                       func.salario = func.salario?.times(1.1)
                       println(func.salario)
                   }else{
                       func.salario = func.salario?.times(1.2)
                       println(func.salario)
                   }

                }
            }
        }
        else -> {
            println("Opcao Invalida")
        }

    }
}