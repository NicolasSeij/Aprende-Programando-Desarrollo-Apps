fun main() {
    var numeroMagico = 24
    println("")
    println("****************************************")
    println("*** ° | Adivina el número mágico | ° ***")
    println("****************************************")
    println("")
    println("Ingresa un número: ")
    var adivina = readLine()!!.toInt() as Int

    if (adivina == 24) {
        println("Muy bien, adivinaste. El número mágico era '24'. ¡Ganaste!")
    } else if (adivina > 24) {
        println("El número es muy alto... ¡perdiste!")
    } else if (adivina < 24){
        println("El número es muy bajo... ¡perdiste!")
    } else {
        println("No adivinaste. ¡Perdiste!")
    }
}