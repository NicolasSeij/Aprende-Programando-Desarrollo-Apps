fun main(){
    var i = 1

    while (i <=5) {
        when {
            i%2==0 -> println("$i es un numero par")
            else -> println("$i es un numero impar")

        }
    }
}