fun main() {
    // b. Variável mutável capaz de armazenar seu nome completo
    var nomeCompleto = "Bernardo Carmo"

    // c. Variável de texto sem valor inicial
    var textoSemValor: String? = null

    // d. Variável imutável para armazenar o número que você calça
    val numeroCalca: Byte = 42

    // e. Variável capaz de armazenar o PIB do Brasil em 2024 (R$ 10,9 trilhões)
    val pibBrasil: Long = 10_900_000_000_000L

    // f. Variável capaz de armazenar a população do Brasil em 2024 (212,6 milhões)
    val populacaoBrasil: Int = 212_600_000

    // g. Cálculo do PIB per capita
    val pibPerCapita = pibBrasil / populacaoBrasil

    // Imprimir o valor do PIB per capita
    println("O PIB per capita do Brasil em 2024 é R$ $pibPerCapita")
}
