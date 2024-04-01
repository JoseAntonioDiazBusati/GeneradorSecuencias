package org.example

class GeneradorSecuencia(
    private val info:Sequence<String>
) {
    private lateinit var sec:Sequence<String>
    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(){}

    fun frasefinal(){}

    fun getSec(){}

    fun mostrarSec(){}
}