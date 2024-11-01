enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        for (usuario in usuarios) {
        	inscritos.add(usuario)    
        }
        
        println("Usuários matriculados: ${inscritos}")
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val user1 = Usuario("João")
    val user2 = Usuario("Maria")
    val user3 = Usuario("José")
    val user4 = Usuario("Paulo")
    val user5 = Usuario("Ana")
    
    val conteudoPython1 = ConteudoEducacional("Fundamentos do Python", 2)
    val conteudoPython2 = ConteudoEducacional("Estruturas de dados com Python", 2)
    val conteudoPython3 = ConteudoEducacional("Programação Orientada a Objetos com Python", 2)
    
    val conteudoPythonList = listOf(conteudoPython1, conteudoPython2, conteudoPython3)
    val formacaoPython = Formacao("Formação Python", conteudoPythonList, Nivel.INTERMEDIARIO)
    
    println(formacaoPython)
    
    formacaoPython.matricular(user1)
    formacaoPython.matricular(user3)
    
    val conteudoJava1 = ConteudoEducacional("Fundamentos do Java", 2)
    val conteudoJava2 = ConteudoEducacional("Estruturas de dados com Java", 4)
    val conteudoJava3 = ConteudoEducacional("Programação Orientada a Objetos com Java", 5)
    
    val conteudoJavaList = listOf(conteudoJava1, conteudoJava2, conteudoJava3)
    val formacaoJava = Formacao("Formação Java", conteudoJavaList, Nivel.BASICO)
    
    println(formacaoJava)
    
    formacaoJava.matricular(user2, user4, user5)
}