fun main() {
    println("Ingrese su edad: ")
    var edad = readLine()?.toInt() as Int
    println("Ingrese la letra inicial, en mayúsculas, que corresponda a su género 'M' si es Mujer " +
            "'H' si es Hombre.")
    var sexo = readLine()?.toString() as String

    if (edad >= 60 && sexo == "M") {
        println("Usted ya puede Jubilarse.")
    } else { println("Aún no puedes jubilarte.")}
    if (edad >= 65 && sexo == "H") {
        println("Usted ya puede Jubilarse.")
    } else { println("Aún no puedes jubilarte.")}
}
