// Código original
// Enunciado / Observação:
// Muitas vezes, em algumas aplicações, sentiremos a necessidade de tomar outras decisões dentro de uma das alternativas da estrutura do se; a isso chamamos de ses aninhados.
//
// prog descubra
// real a, b, c, max;
// imprima "\ndigite 1 numero: ";
// leia a;
// imprima "\ndigite 2 numero: ";
// leia b;
// imprima "\ndigite 3 numero: ";
// leia c; // (Nota: no texto original constava 'e', mas corresponde à terceira variável 'c')
// se (a > b)
// {
//   se (a > c)
//   { max <- a ; }
//   senao
//   { max <- c ; }
// }
// senao
// {
//   se (b > c)
//   { max <- b; }
//   senao
//   { max <- c ; }
// }
// imprima "\n",max;
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 número: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    print("digite 3 número: ")
    val c = readLine()?.toDoubleOrNull() ?: return

    val max: Double

    if (a > b) {
        if (a > c) {
            max = a
        } else {
            max = c
        }
    } else {
        if (b > c) {
            max = b
        } else {
            max = c
        }
    }
    println(max)
}
