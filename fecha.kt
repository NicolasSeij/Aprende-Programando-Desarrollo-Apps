fun main(){
    print("Ingrese un Numero Del 1 al 7: ")
    val valor = readLine()!!.toInt() as Int

    when (valor) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("El Valor Del Numero Ingresado es Incorrecto")

    }
}