// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Bernardo")
    print(" ")
    print("Carmo")

    println()

    var nome = "3. Bernardo\nRodrigues\ndo\nCarmo"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Bernardo" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "do Carmo"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Rodrigues " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}
