// Código original
// Enunciado / Observação: (sem enunciado na fonte original)
//
// prog pesodoplaneta
// int op;
// real pterra;
// imprima " planetas que podem ser analisados : "
// imprima " 1 mercurio "
// imprima " 2 venus "
// imprima " 3 marte "
// imprima " 4 jupiter "
// imprima " 5 saturno "
// imprima " 6 urano "
// imprima " escolha o planeta a ser analisado "
// leia op;
// imprima " entre com um peso na terra " ;
// leia pterra;
// escolha ( op)
// {
// caso 1: imprima "seu peso no planeta terra é: ", (pterra/10)*0.37 ;pare;
// caso 2: imprima "seu peso no planeta terra é: " (pterra/10)*0.88;pare;
// caso 3: imprima "seu peso no planeta terra é: " (pterra/10)*0.38;pare;
// caso 4: imprima "seu peso no planeta terra é: " (pterra/10)*2.64;pare;
// caso 5: imprima "seu peso no planeta terra é: ", (pterra/10)*1.15;pare;
// caso 6: imprima "seu peso no planeta terra é: " (pterra/10)*1.17;pare;
// senao: imprima "este planeta não pode ser analisado";
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    println(" Planetas que podem ser analisados : ")
    println(" 1 - Mercúrio ")
    println(" 2 - Vênus ")
    println(" 3 - Marte ")
    println(" 4 - Júpiter ")
    println(" 5 - Saturno ")
    println(" 6 - Urano ")
    print(" Escolha o planeta a ser analisado: ")
    val op = readLine()?.toIntOrNull() ?: return

    print(" Entre com um peso na terra: ")
    val pterra = readLine()?.toDoubleOrNull() ?: return

    when (op) {
        1 -> println("Seu peso no planeta terra é: ${(pterra / 10) * 0.37}")
        2 -> println("Seu peso no planeta terra é: ${(pterra / 10) * 0.88}")
        3 -> println("Seu peso no planeta terra é: ${(pterra / 10) * 0.38}")
        4 -> println("Seu peso no planeta terra é: ${(pterra / 10) * 2.64}")
        5 -> println("Seu peso no planeta terra é: ${(pterra / 10) * 1.15}")
        6 -> println("Seu peso no planeta terra é: ${(pterra / 10) * 1.17}")
        else -> println("Este planeta não pode ser analisado.")
    }
}