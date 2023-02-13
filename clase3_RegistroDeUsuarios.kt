fun main() {

    println("")
    println("** Registre un nombre de Usuario y una Contraseña **")
    println("")
    println("Elija un nombre de usuario: ")
    val usuario = readLine()?.toString() as String

    println("Elija una contraseña: ")
    val clave = readLine()?.toString() as String

    println("")
    println("Usuario registrado exitosamente.")
    println("")
    println("Antes de operar ingrese su Usuario y Contraseña: ")
    println("")
    println("Ingrese su usuario: ")
    val usuario2 = readLine()?.toString() as String
    println("")
    println("Ingrese su contraseña: ")
    val clave2 = readLine()?.toString() as String

    if ( usuario == usuario2 && clave == clave2) {
        println("")
        println("Accediste al programa exitosamente.")
    } else {
        println("")
        println("||** Acceso Denegado ** ||")
        println("** Usuario no registrado **")
        println("")
    }
    println("")
    println("--> Fin del Programa <--")


}