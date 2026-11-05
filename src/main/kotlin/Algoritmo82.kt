// Código original
// Enunciado:
// Ler um número e se ele for maior do que 20, então imprimir a metade do número.
//
// Solução nº 1:
// prog metade
// real numero, met;
// imprima "digite numero: ";
// leia numero;
// se( numero > 20. )
// {
// met <- numero / 2;
// imprima "\nmetade: ", met ;
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toDoubleOrNull() ?: return

    if (numero > 20.0) {
        val met = numero / 2.0
        println("Metade: $met")
    }
}