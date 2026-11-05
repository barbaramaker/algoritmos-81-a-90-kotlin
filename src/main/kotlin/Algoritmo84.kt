// Código original
// Enunciado:
// Ler um número e imprimir se ele é par ou ímpar.
//
// prog parimpar
// int a;
// imprima "\nDigite numero: ";
// leia a;
// se(a % 2 == 0)
// {imprima "\nPAR";}
// senao
// {imprima "\nIMPAR";}
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val a = readLine()?.toIntOrNull() ?: return

    if (a % 2 == 0) {
        println("PAR")
    } else {
        println("ÍMPAR")
    }
}