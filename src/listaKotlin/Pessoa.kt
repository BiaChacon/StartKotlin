package listaKotlin

import java.time.LocalDate

open class Pessoa(var nome:String, var altura:Double){

    var dataNasc: LocalDate? = null
    var idade:Int = 0
        private set

    constructor(nome:String, altura:Double, dataNasc: LocalDate): this(nome, altura){
        this.dataNasc = dataNasc
        this.idade = calcularIdade()
    }

    override fun toString(): String {
        val d = dataNasc?: "Não informado"
        return "$nome ($d, $altura)"
    }

    private fun calcularIdade(): Int{
        return LocalDate.now().year - dataNasc!!.year
    }

}