// Código original
// Enunciado:
// Entrar com um número e imprimi-lo caso seja maior que 20.
//
// prog se1
// real numero;
// imprima "\n\ndigite numero: ";
// leia numero;
// se ( numero > 20. )
// { imprima numero; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toDoubleOrNull() ?: return

    if (numero > 20.0) {
        println(numero)
    }
}