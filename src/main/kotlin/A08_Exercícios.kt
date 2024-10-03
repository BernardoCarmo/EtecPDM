// Aula 8: Exercício de reforço
// Métodos e funções

fun main() {
    // Exercício 1: Conversão de anos em várias unidades
    converterAnos(2)
    
    // Exercício 2: Contar caracteres de uma string
    println(contarCaracteres("Exemplo de string"))
    
    // Exercício 3: Calcular o cubo de um número
    println(cubo(3))
    
    // Exercício 4: Converter milhas em km
    println(converterMilhasParaKm(10.0))
    
    // Exercício 5: Substituir "a" ou "A" por "x" e transformar em maiúsculas
    val entrada = "Programação em Kotlin"
    println(trocarAeAporX(entrada))
}

// Exercício 1: Função para converter anos em meses, dias, horas, minutos e segundos
fun converterAnos(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365  // Aproximando o ano como 365 dias
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos anos equivalem a:")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

// Exercício 2: Função para contar caracteres de uma string
fun contarCaracteres(texto: String): Int = texto.length

// Exercício 3: Função para calcular o cubo de um número
fun cubo(n: Int): Int = n * n * n

// Exercício 4: Função para converter milhas em quilômetros
fun converterMilhasParaKm(milhas: Double): Double = milhas * 1.6

// Exercício 5: Função para substituir "a" ou "A" por "x" e transformar tudo em maiúsculas
fun trocarAeAporX(texto: String): String = texto.uppercase().replace('A', 'X')
