package listaKotlin

class Agenda(){

    var pessoas = arrayOfNulls<Pessoa>(10)

    fun armazenaPessoa(p: Pessoa){

        for(i in pessoas.indices){
            if(pessoas[i] == null) {
                pessoas[i] = p
                return
            }
        }

    }

    fun removePessoa(nome: String){

        for(i in pessoas.indices){
            if(pessoas[i]?.nome == nome){
                pessoas[i] = null
            }
        }

    }

    fun buscaPessoa(nome:String): Pessoa?{

        for(p:Pessoa? in pessoas)
            if(p?.nome == nome) return p
        return null

    }

    fun printAgenda(){
        for(p in pessoas){
            println(p)
        }
    }

    fun printPessoa(index: Int){
        println(pessoas.getOrNull(index))
    }

}