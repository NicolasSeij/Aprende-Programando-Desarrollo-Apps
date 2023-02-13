// Registro de User y Pass con Condicional

fun main() {

    val usuarioRegistrado = "Admin"
    val claveRegistrada = "medialuna"

    println("** Usuario y Contraseña **")
    println("")
    println("Ingrese su nombre de usuario registrado (ver línea 5 del código): ")
    val usuarioIngresado = readLine()?.toString()

    println("Ingrese su contraseña (ver línea 6 del código): ")
    val claveIngresada = readLine()?.toString()

    if ( usuarioRegistrado == usuarioIngresado && claveRegistrada == claveIngresada) {
        println("Accediste al programa exitosamente.")
    } else {
        println("\n||** Acceso Denegado ** ||")
        println("** Usuario no registrado **\n")
    }
    println("--> Fin del Programa <--")
}