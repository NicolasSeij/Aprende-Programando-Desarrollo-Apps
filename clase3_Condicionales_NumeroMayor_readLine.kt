fun main() {

    println("")
    println("*****************************************************************")
    println("** Ingresa 2 números y el programa te dirá cuál es más grande. **")
    println("*****************************************************************")
    println("")
    println("Ingresa un número entero: ")
    var numeroA = readLine()?.toInt() as Int
    println("")
    println("Ingresa otro número entero: ")
    var numeroB = readLine()?.toInt() as Int

    if (numeroA > numeroB) {
        println("")
        println("El número [ $numeroA ] es mayor que [ $numeroB ].")
    } else {
        println("")
        println("El número [ $numeroB ] es mayor que [ $numeroA ].")
    }
    println("")
    println("| --- Fin del Programa --- |")
}