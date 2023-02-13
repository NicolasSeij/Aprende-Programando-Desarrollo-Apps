// do ... while + when

fun main() {

    /*
    mientras se cumpla esta condición se ejecutan las
    instrucciones que se encuentran entre llaves.
     */

    println("")
    println("**********************************")
    println("**      Esquema de Clases       **")
    println("**       Intensivos 2023        **")
    println("**********************************")
    println("")
    print("Presione 0 (''cero'') para ver el listado de temas: ")

    var seleccion = readLine()!!.toInt()

    do {
        println("")
        println(" | Temario de Clases | ")
        println("")
        println("[1] Instalación del IDE.")
        println("[2] Variables, operadores aritméticos, concatenadores.")
        println("[3] Operadores Relacionales, Condicionales, Operadores Lógicos.")
        println("[4] Condicionales Anidados, When.")
        println("[5] While, do ...while.")
        println("[6] Funciones.")
        println("[7] Array.")
        println("[8] Litas.")
        println("[9] POO.")
        println("[10].XML.")
        println("")
        println("[0] Ver Menú ")
        println("")
        print("Presione la opción deseada: ")
        println("")
    } while (seleccion == 1000) // CUIDADO con esta línea. Si ponés 1000 en la selección, el código entre en un bucle infinito y tendrás que slair printo de él, cerrando el intellij IDEA o reiniciado la computadora antes de que se dañe algo. 

    var seleccion2 = readLine()!!.toInt()

    when (seleccion2) {
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
        0 -> println(" | Presiona ESC para salir? | ") }
}