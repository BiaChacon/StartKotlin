package listaKotlin


class AgendaList(){

    var pessoas =  ArrayList<Pessoa>()

    fun addPessoa(p:Pessoa) = pessoas.add(p)

    fun removePessoa(nome: String){

        for(i in pessoas.indices){
            if(pessoas[i]?.nome == nome){
                pessoas.remove(pessoas[i])
            }
        }

    }

    fun buscaPessoa(nome:String): Pessoa?{

        for(p:Pessoa? in pessoas) {
            if (p?.nome == nome){

            }
        }
        return null

    }

    fun printAgenda() = pessoas.forEach{ println(it)}

    fun printPessoa(index: Int) = println(pessoas.getOrNull(index))

}

