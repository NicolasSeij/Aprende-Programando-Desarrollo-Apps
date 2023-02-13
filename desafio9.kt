class Perro(var raza: String, var nombre: String, var colorOjos: String) {
    fun irAlBaño() {
        println("¡Soy un perro y estoy tirando la cadena!")
    }

    fun mostrarDatos() {
        println("Raza: $raza")
        println("Nombre: $nombre")
        println("Color de ojos: $colorOjos")
    }
}

fun main(args: Array<String>) {
    val perro = Perro("Collie", "Procer", "Negro")
    perro.irAlBaño()
    perro.mostrarDatos()
}
