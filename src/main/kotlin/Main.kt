/**
 *
 * No me ha tiempo a llegar a mi casa con esto full adaptado. Pero funciona y sé cómo cambiarlo.
 *
* Solicita un número entero en un rango.
*
* @param min Int - valor mínimo
* @param max Int - valor máximo
*
* @return Int - número entero válido dentro del rango especificado
*/
fun pedirNum(min: Int, max: Int) {

    println("Please, insert a number: ")
    val num = readln().toInt()
    val tabla = Array(11) {"$num * $it = ${num * it}" }

    println(tabla.joinToString("\n"))

}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta(text: String): Boolean{

    while (true) {
        println("¿Quieres comprobar otra tabla? (s/n)")
        val respuesta = readln()
        if (respuesta == "s") {
            pedirNum(1, 11)
        } else {
            break
        }
    }
    return "".toBoolean()
}

fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"

    pedirNum(1, 11)
    pregunta(text = "")
}