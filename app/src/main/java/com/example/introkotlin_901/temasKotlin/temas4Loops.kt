package com.example.introkotlin_901.temasKotlin

fun main() {

    // FOR con rango numérico
    println("Ejemplo de for con rango:")
    for (numero in 1..5) {
        println("Número: $numero")
    }

    // FOR con una lista
    val nombres = listOf("Ronald", "Mario", "Veronica")
    println("\nEjemplo de for con lista:")
    for (nombre in nombres) {
        println("Nombre: $nombre")
    }

    // WHILE loop
    println("\nEjemplo de while:")
    var x = 1
    while (x <= 5) {
        println("x vale: $x")
        x++
    }

    // DO-WHILE loop
    println("\nEjemplo de do-while:")
    var y = 6
    do {
        println("y vale: $y")
        y++
    } while (y <= 5) // se ejecuta al menos una vez

    // IF dentro de un for
    println("\nEjemplo de if dentro de un for:")
    for (numero in 1..10) {
        if (numero % 2 == 0) {
            println("$numero es par")
        } else {
            println("$numero es impar")
        }
    }

    // IF simple
    println("\nEjemplo de if simple:")
    val edad = 18
    if (edad >= 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }
}