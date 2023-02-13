//int numeros
//string letras

fun sumar(numero1: Int, numero2: Int): Int {
    var resultado = numero1 + numero2
    return resultado
}


fun main(){
    print("Ingrese Su Nombre Completo: ")
    val nombreDeUsuario = readLine()!!.toString() as String

    print("Ingrese Su Edad: ")
    val edadDeUsuario = readLine()!!.toInt() as Int


    println("Bienvenido A After Shop $nombreDeUsuario estamos buscando personal Mayor a 18 años Ustede es valido para el trabajo por que tiene $edadDeUsuario ")

    val resultado = sumar(9, 2)
    println("La Suma es $resultado")

    val valor1 = 4
    val valor2 = 9
    val valor3 = 7
    println("el Mayor de los tres es ${maxOf(valor1, valor2, valor3)}")
}

