fun main () {

    // Inicio tramo #2 del proyecto integrador.

    println("")
    println("**********************************")
    println("**                              **")
    println("** Manual interactivo de Kotlin **")
    println("**                              **")
    println("**********************************")
    println("")
    println("Hola, soy @matiBot, un programa de aprendizaje interactivo sobre Kotlin.")
    println("")
    println("¿Cómo te llamás?")

    val usuario = readLine()?.toString() as String

    println("")
    println("Hola $usuario elige una lección de Kotlin")
    println("")

    println("Presiona:")
    println("[1] si quieres aprender sobre variables.")
    println("[2] si quieres aprender sobre condicionles if-else")
    println("[3] si quieres aprender sobre condicionales when")

    var opcion = readLine()?.toInt() as Int

    if (opcion == 1) {
        println("Bienvenido al capítulo sobre variables.")
    } else if (opcion == 2) {
        println("Bienvenido a la sección sobre condicionales if-else")
    } else if (opcion == 3) {
        println("Bienvenidos al capítulo sobre condicionales when")
    } else {
        println("No has elegido una opción válida")
    }
}