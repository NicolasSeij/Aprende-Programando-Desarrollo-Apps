fun intervalo(numero: Int, min: Int, max: Int): Boolean {
    return min <= numero && numero <= max
}

fun main() {
    val num = 5
    val mini = 1
    val maxi = 10
    println(intervalo(num, mini, maxi))
}