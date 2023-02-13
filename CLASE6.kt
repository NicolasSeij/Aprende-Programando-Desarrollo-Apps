fun main() {
    saludo()
    bienvenida()
    despedida()
    println(nombre)
    miNombre()
}

fun saludo() {
    println("Hola Buenas!")
    var apellido = "Lopez"
    println(apellido)
}

fun bienvenida() {
    println("Bienvenido a Kotlin")

}

fun despedida() {
    println("Buen Viaje!")
}

var  nombre = "Lopez" //esto es una variable global por que sirve en cualquier parte del programa



fun miNombre() {
    println("Mi Nombre es: Pepa Pig LA GORDA")
}

