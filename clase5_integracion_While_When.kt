// | Clase 5 | While para clave | do ... while para Menu

fun main() {
    var clave = 3399

    println("Ingrese su clave de 4 dígitos: ")

    var claveIngresada = readLine()!!.toInt()

    while (clave != claveIngresada) {
        println("Clave incorrecta. Reintente, por favor.")
        println("Clave: ")
        claveIngresada = readLine()!!.toInt()
    }
    println("* Acceso permitido *")
    println("")
    println("Lecciones Kotlin: ")
    println("")
    println("[1] Aprende sobre Variables.")
    println("[2] Aprende sobre Operadores Aritméticos básicos.")
    println("[3] Aprende sobre Operadores Relacionales.")
    println("[4] Aprende sobre Condicionales.")
    println("[5] Aprende sobre Operadores Lógicos.")
    println("[6] Aprende sobre When.")
    println("[7] Aprende sobre Bucles While.")
    println("[8] Aprende sobre Funciones.")
    println("[9] Aprende sobre Array.")
    println("[10] Aprende sobre Listas.")
    println("[11] Aprende sobre POO.")
    println("[12] Aprende sobre XML.\n")
    println("Elige una opción: ")

    var opcionElegida = readLine()!!.toInt()

    when (opcionElegida) {
        1 -> {
            println("* Variables en Kotlin *")
            println("")
            println(
                "Las variables, en todos los lenguajes de programación, son espacios reservados en memoria. Pueden ser de distinto tipo: Int, String, Double, Float, Boolean, Char.")
            opcionElegida = 0
        }
        2 -> {
            println("* Operadores Aritméticos Básicos *")
            println("")
            println("Nos referimos a la suma, resta, multiplicación, división y resto.")
            opcionElegida = 0
        }
        3 -> {
            println("* Operadores Relacionales *")
            println("")
            println("Son los responsables de evaluar una condición.")
            opcionElegida = 0
        }
        4 -> {
            println("* Condicionales *")
            println("")
            println(
                "Son estructuras de control que permiten la bifurcación del código \n" +
                        "ejecutando un conjunto de instrucciones u otro, dependiendo \n" +
                        "del resultado de la condición evaluada."
            )
            opcionElegida = 0
        }
        else -> {
            println("No has ingresado una opción válida. ")
            println("")
            println("Elige una opción: ")
            println("")
            println("[1] Aprende sobre Variables.")
            println("[2] Aprende sobre Operadores Aritméticos básicos.")
            println("[3] Aprende sobre Operadores Relacionales.")
            println("[4] Aprende sobre Condicionales.")
            println("[5] Aprende sobre Operadores Lógicos.")
            println("[6] Aprende sobre When.")
            println("[7] Aprende sobre Bucles While.")
            println("[8] Aprende sobre Funciones.")
            println("[9] Aprende sobre Array.")
            println("[10] Aprende sobre Listas.")
            println("[11] Aprende sobre POO.")
            println("[12] Aprende sobre XML.")
            println("------------------------")
            println("[0] Salir.")
            opcionElegida = readLine()!!.toInt()
        }
    }

}