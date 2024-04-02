package org.example

class Consola:IConsola{
    override fun leerEntero(mensaje: String): Int{
        while (true) {
            mostrarMensaje(mensaje)
            val input = readLine()
            if (input != null && input.toIntOrNull() != null) {
                return input.toInt()
            } else {
                mostrarMensaje("Error: Entrada inválida. Debe ingresar un número entero.")
            }
        }
    }
    override fun mostrarMensaje(mensaje: String){
        println(mensaje)
    }
}