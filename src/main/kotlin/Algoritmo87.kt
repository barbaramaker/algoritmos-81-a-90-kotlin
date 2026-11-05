// Código original
// Enunciado:
// Criar um algoritmo que permita ao aluno responder qual a capital do Brasil. Todas as possibilidades deverão ser pensadas.
//
// prog geo
// string resp;
// imprima "\nQual a capital do Brasil? ";
// leia resp;
// se(resp == "BRASÍLIA" || resp == "Brasília")
// {imprima "\nPARABÉNS!";}
// senao
// { se(resp=="brasília" || resp=="BRASÍLIA" || resp=="Brazília" || resp=="brazília")
// { imprima "\nCERTO! Mas atençâo para grafia: Brasília ou BRASÍLIA ";}
// senao
// { imprima "\nERRADO! ESTUDE MAIS!";}
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Qual a capital do Brasil? ")
    val resp = readLine() ?: return

    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("PARABÉNS!")
    } else {
        if (resp == "brasília" || resp == "BRASÍLIA" || resp == "Brazília" || resp == "brazília" || resp == "BRAZÍLIA") {
            println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
        } else {
            println("ERRADO! ESTUDE MAIS!")
        }
    }
}