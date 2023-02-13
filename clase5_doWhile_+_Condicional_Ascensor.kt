// Ascensor de Carga | do ... while + condicional anidado else-if

fun main() {

    var capacidadCarga = 300

    println("")
    println("* Capacidad máxima del Ascensor es: $capacidadCarga kg. *\n")

    var pesoBulto = 0
    var pesoAcumulado = 0

    do {
        println("Ingrese el peso del paquete en Kg.")
        pesoBulto = readLine()!!.toInt()
        pesoAcumulado = pesoBulto + pesoAcumulado
        println("La carga total ingresada es de: $pesoAcumulado kg.\n")
    } while (pesoAcumulado < capacidadCarga)

    var pesoExcedido = pesoAcumulado - capacidadCarga

    if (pesoAcumulado > capacidadCarga) {
        println("La carga excedida es de: $pesoExcedido Kg. \n" +
                " sepárela ... será enviada en el siguente despacho.")
    } else if (pesoAcumulado == 300) {
        println("Despacho Exitoso !!!")
    } else {
        println("Carga en revisión")
    }
}