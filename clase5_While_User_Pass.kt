fun main() {

    var clave = 3399

    println("Ingrese su clave de 4 dígitos: ")

    var claveIngresada = readLine()!!.toInt()

    while (clave != claveIngresada) {
        println("Clave incorrecta. Reintente, por favor.")
        println("Clave: ")
        claveIngresada = readLine()!!.toInt()
    }
    println("* Accediste exitosamente al sistema *")
}