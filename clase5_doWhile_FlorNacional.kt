// Clase #5 | do While | ejecuta el código entre llaves antes de evaluar la condición
// y sale del ciclo cuando devuelve false.

fun main() {
    do {
        println("")
        println("¿Cuál es la flor nacional de Argentina?:\n")
        println("a. Jazmín")
        println("b. Rosa")
        println("c. Ceibo")
        println("d. Margarita\n")

        print("Ingresa tu respuesta: ")
        val opcion = readLine()!!.toString()
        val reintento = opcion != "c"

        if(reintento){
            println("¡Respuesta incorrecta!\n")
        }else{
            println("* ¡Respuesta correcta! *\n")
        }
    } while (reintento)
}