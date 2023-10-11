// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, var idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.addAll(usuarios)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudo1 = ConteudoEducacional("Kotlin")
    val conteudo2 = ConteudoEducacional("Java")
    
    var conteudos: MutableList<ConteudoEducacional> = mutableListOf(conteudo1, conteudo2)
    
    var formacao = Formacao("Programador", conteudos)
    
    var usuario1 = Usuario("Henrique", 31)
    var usuario2 = Usuario("João", 21)
    var usuario3 = Usuario("Marcos", 29)
    
    formacao.matricular(usuario1, usuario2, usuario3)
    println("Usuario(s) matriculado(s): ${formacao.inscritos.size}")
    for(usuario in formacao.inscritos){
        println("Formacao: ${formacao.nome} \r\n Aluno: ${usuario.nome} \r\n Idade: ${usuario.idade}")
    }    
}
