package com.example.introkotlin_901.temasKotlin

fun main() {
    println("Hola Mundo !!")

    val nombre = "Ronald"
    val apellido: String = "Cardiel"

    // Es funcional, pero si la intención es un espacio, sería mejor:
    // println(nombre + " " + apellido)
    // o simplemente confiar en la siguiente línea que ya lo hace bien.
    println(nombre + "" + apellido) // Funciona, pero "" no añade espacio visible

    println( "Hola $nombre $apellido")

    // Cambiar 'val' a 'var' para permitir la modificación
    var num1 = 10
    println("La suma de $num1 + 2 es ${num1 + 2}")

    num1 = num1 + 3
    num1 += 4
    num1++
    println(num1)

    var sueldo: Float = 12.25f
    val precio: Double = 20.5
    val mayorEdad: Boolean = true
    val estadoCivil: Char = 'S'
}