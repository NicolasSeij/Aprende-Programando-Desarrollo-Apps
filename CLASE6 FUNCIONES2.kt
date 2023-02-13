fun saludar(nombre:String){
    println("\n !Hola $nombre!")
    println("Estamos en la clase 6 de AP")
}

fun main(){
    println("Como Te Llamas?")
    val nombreUsuario = readLine()!!
    saludar(nombreUsuario)
}