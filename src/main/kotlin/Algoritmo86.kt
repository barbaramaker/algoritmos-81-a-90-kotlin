// Código original
// Enunciado:
// Ler um número e imprimir se ele é positivo, negativo ou nulo.
//
// prog pnn
// real num;
// imprima "\nDigite numero: ";
// leia num;
// se(num > 0.)
// {imprima "\nPOSITIVO";}
// senao
// { se(num < 0.)
// { imprima "\nNEGATIVO";}
// senao
// { imprima "\nNULO";}
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val num = readLine()?.toDoubleOrNull() ?: return

    if (num > 0.0) {
        println("POSITIVO")
    } else {
        if (num < 0.0) {
            println("NEGATIVO")
        } else {
            println("NULO")
        }
    }
}