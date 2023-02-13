fun main() {
    val lista = listOf(1, 2, 3, 4, 5)
    var sumatoria = 0
    for (i in 0 until lista.size) {
        sumatoria += lista[i]
    }
    println(sumatoria)
}