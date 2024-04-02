package org.example

class GeneradorSecuencia(
    private val consolaImpl: IConsola
):IEntradaSalida {
    private lateinit var sec:Sequence<String>
    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    override fun fraseIncremental(numPalabras: Int){
        sec = sequence {
            repeat(numPalabras) {
                val palabra = lineSequence(1).singleOrNull()
                if (palabra != null) {
                    yield(palabra)
                    println(palabra)
                } else {
                    println("Error: Entrada inválida. Debe ingresar una sola palabra.")
                }
            }
        }
        mostrarSec()
    }
    override fun frasefinal(numPalabras: Int) {
        fraseIncremental(numPalabras)
        consolaImpl.mostrarMensaje("Frase completa: ${getSec()}")
    }
    override fun getSec(): String{
        return sec.joinToString(" ")
    }
    override fun mostrarSec(){
        consolaImpl.mostrarMensaje("Secuencia final: ${getSec()}")
    }
}