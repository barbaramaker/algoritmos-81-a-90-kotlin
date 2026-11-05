// Código original
// Enunciado:
// Ler um número e, se ele for positivo, imprimir seu inverso; caso contrário, imprimir o valor absoluto do número.
//
// Solução nº 1:
// prog inversoabsoluto
// real numero, inverso, absoluto;
// imprima "digite numero:";
// leia numero;
// se( numero > 0. )
// { inverso <- 1 / numero;
// imprima "\ninverso: ",
// inverso;}
// senao
// { absoluto <- numero * -1;
// # ou absoluto <- abs(numero);
// imprima "\nabsoluto: ",
// absoluto;}
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite número: ")
    val numero = readLine()?.toDoubleOrNull() ?: return

    if (numero > 0.0) {
        val inverso = 1.0 / numero
        println("Inverso: $inverso")
    } else {
        val absoluto = kotlin.math.abs(numero)
        println("Absoluto: $absoluto")
    }
}