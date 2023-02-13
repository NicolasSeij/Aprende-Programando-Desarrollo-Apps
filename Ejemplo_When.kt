// Ejemplo de When.

fun main() {

    println("\n**********************************")
    println("**      Esquema de Clases       **")
    println("**       Intensivos 2023        **")
    println("**********************************\n")

    println(" | Temario de Clases | \n")
    println("[1] instalación del IDE.")
    println("[2] Variables, operadores aritméticos, concatenadores.")
    println("[3] Operadores Relacionales, Condicionales, Operadores Lógicos.")
    println("[4] Condicionales Anidados, When.")
    println("[5] While, do ...while.")
    println("[6] Funciones.")
    println("[7] Array.")
    println("[8] Litas.")
    println("[9] POO.")
    println("[10].XML.\n")
    print("Presione la opción deseada: ")

    var seleccion = readLine()!!.toInt()

    when (seleccion) {
        1 -> println(" | Temas de la Clase #1 |\n " +
                "                  -¿Qué es programar?\n" +
                "                  - Algoritmos. \n" +
                "                  -IDE. \n")
        2 -> println(" | Clase #2 | \n" +
                "                  - Variables.\n" +
                "                  - Operadores aritméticos.\n" +
                "                  - Concatenación. \n")
        3 -> println(" | Clase #3 | \n" +
                "                  - Operadores Ralacionales.\n" +
                "                  - Condicionales.\n" +
                "                  - Operadores Lógicos.\n ")
        4 -> println(" | Clase #4 | \n" +
                "                  - Condicionales Anidados.\n" +
                "                  - When.\n")
        5 -> println(" | Clase #5 | " +
                "                  - While.\n" +
                "                  - do ...While.")
        6 -> println(" | Clase #6 | \n" +
                "                  - Funciones.")
        7 -> println(" | Clase #7 | \n" +
                "                  - Array.")
        8 -> println(" | Clase #8 | \n" +
                "                  - Listas.")
        9 -> println(" | Clase #9 | \n" +
                "                  - POO.")
        10 -> println(" | Clase #10 | \n" +
                "                  - .XML.")
        0 -> println(" | Presiona ESC para salir? | ")
    }

}