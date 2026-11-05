// Código original
// Enunciado:
// Criar um algoritmo que, dado um número de conta corrente com três dígitos,
// retorne o seu dígito verificador, o qual é calculado da seguinte maneira:
// Exemplo: número da conta: 235
// - Somar o número da conta com o seu inverso: 235 + 532 = 767
// - multiplicar cada dígito pela sua ordem posicional e somar estes resultados: 7 6 7
//                                                                             X1 X2 X3
//                                                                          7 + 12 + 21 = 40
// - o último dígito desse resultado é o dígito verificador da conta (40 -> 0).
//
// prog lea54
// int conta, inv, digito, d1, d2, d3, soma;
// imprima "\nDigite conta de tres digitos: ";
// leia conta;
// d1 <- conta div 100;
// d2 <- conta % 100 div 10;
// d3 <- conta % 100 % 10;
// inv <- d3 *100 + d2 *10 +d1;
// soma <- conta + inv;
// d1 <- (soma div 100) * 1;
// d2 <- (soma % 100 div 10) * 2;
// d3 <- (soma % 100 % 10) * 3;
// digito <- (d1 +d2 +d3) % 10;
// imprima "\ndigito verificador: ", digito;
// imprima "\n";
// fimprog[cite: 2]

// Código em Kotlin

fun main() {
    print("Digite conta de três dígitos: ")
    val conta = readLine()?.toIntOrNull() ?: return

    val d1 = conta / 100
    val d2 = (conta % 100) / 10
    val d3 = (conta % 100) % 10

    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv

    val s1 = (soma / 100) * 1
    val s2 = ((soma % 100) / 10) * 2
    val s3 = ((soma % 100) % 10) * 3

    val digito = (s1 + s2 + s3) % 10

    println("Dígito verificador: $digito")
}