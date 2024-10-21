/*
    Aula 15: Exercícios de reforço
    Controle de Fluxo: while()
 */

// CONTROLE DE FLUXO - while()
fun main() {
    litros()
    fizzBuzz()
    inverterTexto("Meu nome é Asdrúbal")
    println(verificarXEO("xXoOxxoo"))
}

// 1. Quantos balões de 7 litros cabem em uma caixa de 2000 litros
fun litros() {
    var caixa = 2000
    var numBaloes = 0
    while (caixa >= 7) {
        caixa -= 7
        numBaloes++
    }
    println("Cabem $numBaloes balões.")
}

// 2. FizzBuzz de 1 a 50
fun fizzBuzz() {
    var num = 1
    while (num <= 50) {
        when {
            num % 3 == 0 && num % 5 == 0 -> println("FizzBuzz")
            num % 3 == 0 -> println("Buzz")
            num % 5 == 0 -> println("Fizz")
            else -> println(num)
        }
        num++
    }
}

// 3. Inverter texto
fun inverterTexto(texto: String) {
    var invertido = ""
    var i = texto.length - 1
    while (i >= 0) {
        invertido += texto[i]
        i--
    }
    println(invertido)
}

// 4. Verificar quantidade de 'x' e 'o'
fun verificarXEO(str: String): Boolean {
    var countX = 0
    var countO = 0
    var i = 0
    
    while (i < str.length) {
        when (str[i].lowercaseChar()) {
            'x' -> countX++
            'o' -> countO++
        }
        i++
    }
    
    return if (countX == 0 && countO == 0) false else countX == countO
}
