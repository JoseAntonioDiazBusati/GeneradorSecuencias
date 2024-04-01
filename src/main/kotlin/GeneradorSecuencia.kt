package org.example

class GeneradorSecuencia(
    var sec:
) {
    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)
    private fun readlnStrings() = readln().split(' ')
    private fun readlnBytes() = readlnStrings().map { it.toByte() }
    private fun readlnShorts() = readlnStrings().map { it.toShort() }
    private fun readlnInts() = readlnStrings().map { it.toInt() }
    private fun readlnLongs() = readlnStrings().map { it.toLong() }
    private fun readlnFloats() = readlnStrings().map { it.toFloat() }
    private fun readlnDoubles() = readlnStrings().map { it.toDouble() }
}