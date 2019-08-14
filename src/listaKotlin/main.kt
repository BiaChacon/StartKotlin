package listaKotlin

import java.time.LocalDate

fun main(){

    val p1 = Pessoa("Bia",1.60)
    val p2 = Pessoa("Chacon", 1.60, LocalDate.of(1999,6,7))

    println(p1.toString())
    p1.dataNasc = LocalDate.of(1999,6,7)
    println(p1.toString())

    println(p2.toString())
    println(p2.idade)

    println("Questão 2")
    var agenda = Agenda()
    agenda.armazenaPessoa(p1)
    agenda.armazenaPessoa(p2)
    agenda.printAgenda()
    agenda.printPessoa(1)
    agenda.buscaPessoa("Bia")
    agenda.removePessoa("Chacon")
    agenda.printAgenda()

    println("Questão 3")
    var agendaList = AgendaList()
    agendaList.addPessoa(p1)
    agendaList.addPessoa(p2)
    agendaList.printAgenda()
    //agendaList.removePessoa("Bia")
    agendaList.removePessoa("Bia")

    println("Questão 4")
    var funcionario = Funcionario(1.000,"Bia", 1.60)
    println(funcionario.toString())

}