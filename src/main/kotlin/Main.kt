package org.example

fun main() {
    val consola = Consola()
    val generador = GeneradorSecuencia(consola)

    var numPalabras: Int
    do {
        numPalabras = consola.leerEntero("Ingrese el número de palabras para la frase incremental:")
    } while (numPalabras <= 0)

    generador.fraseIncremental(numPalabras)

    do {
        numPalabras = consola.leerEntero("Ingrese el número de palabras para la frase final:")
    } while (numPalabras <= 0)

    generador.frasefinal(numPalabras)
}