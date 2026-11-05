// Código original
// Enunciado / Algoritmo Calculadora:
// prog calculadora
// string resp;
// real a,b;
// imprima "\n\n\t\t\t\t*************\n";
// imprima "\t\t\t\t*CALCULADORA*\n";
// imprima "\t\t\t\t*************\n";
// imprima "\n\t\t\t\t+ para somar\n";
// imprima "\n\t\t\t\t- para subtrair\n";
// imprima "\n\t\t\t\t* para multiplicar\n";
// imprima "\n\t\t\t\t/ para dividir\n";
// imprima "\n\n\t\t\t\tDigite opcao: ";
// leia resp;
// se(resp=="+")
// {
// imprima " \nDigite 1 numero com ponto: ";
// leia a;
// imprima "\nDigite 2 numero com ponto: ";
// leia b;
// imprima "\nSOMA: " ,a + b;
// }
// senao
// {
// se(resp=="-")
// {
// imprima "\nDigite 1 numero com ponto: ";
// leia a;
// imprima "\nDigite 2 numero com ponto: ";
// leia b;
// imprima "\nSUBTRACAO : " ,a - b;
// }
// senao
// {
// se(resp=="*")
// {
// imprima "\nDigite 1 numero com ponto: ";
// leia a;
// imprima "\nDigite 2 numero com ponto: ";
// leia b;
// imprima"\nMULTIPLICACAO: ",a * b;
// }
// senao
// {
// se(resp=="/")
// {
// imprima "\nDigite 1 numero com ponto: ";
// leia a;
// imprima "\nDigite 2 numero com ponto: ";
// leia b;
// imprima "\nDIVISAO: ",a / b;
// }
// senao
// {
// imprima "\nOPÇAO NAO DISPONÍVEL!";
// }
// }
// }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    println("\n\t\t\t\t*************")
    println("\t\t\t\t*CALCULADORA*")
    println("\t\t\t\t*************\n")
    println("\t\t\t\t+ para somar")
    println("\t\t\t\t- para subtrair")
    println("\t\t\t\t* para multiplicar")
    println("\t\t\t\t/ para dividir\n")
    print("\t\t\t\tDigite opcao: ")

    val resp = readLine() ?: ""

    if (resp == "+") {
        print("Digite 1 número com ponto: ")
        val a = readLine()?.toDoubleOrNull() ?: return
        print("Digite 2 número com ponto: ")
        val b = readLine()?.toDoubleOrNull() ?: return
        println("SOMA: ${a + b}")
    } else {
        if (resp == "-") {
            print("Digite 1 número com ponto: ")
            val a = readLine()?.toDoubleOrNull() ?: return
            print("Digite 2 número com ponto: ")
            val b = readLine()?.toDoubleOrNull() ?: return
            println("SUBTRAÇÃO : ${a - b}")
        } else {
            if (resp == "*") {
                print("Digite 1 número com ponto: ")
                val a = readLine()?.toDoubleOrNull() ?: return
                print("Digite 2 número com ponto: ")
                val b = readLine()?.toDoubleOrNull() ?: return
                println("MULTIPLICAÇÃO: ${a * b}")
            } else {
                if (resp == "/") {
                    print("Digite 1 número com ponto: ")
                    val a = readLine()?.toDoubleOrNull() ?: return
                    print("Digite 2 número com ponto: ")
                    val b = readLine()?.toDoubleOrNull() ?: return
                    println("DIVISÃO: ${a / b}")
                } else {
                    println("OPÇAO NAO DISPONÍVEL!")
                }
            }
        }
    }
}