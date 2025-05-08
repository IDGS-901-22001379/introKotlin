package com.example.introkotlin_901.temasKotlin

import kotlin.math.sqrt

fun main() {
    println("Resolviendo ecuaciones cuadráticas con la fórmula general")

    while (true) {
        print("Ingresa el valor de a: ")
        val a = readln().toDoubleOrNull()
        if (a == null || a == 0.0) {
            println("El valor de 'a' debe ser un número diferente de 0.")
            continue
        }

        print("Ingresa el valor de b: ")
        val b = readln().toDoubleOrNull()
        if (b == null) {
            println("Ingresa un valor válido para 'b'.")
            continue
        }

        print("Ingresa el valor de c: ")
        val c = readln().toDoubleOrNull()
        if (c == null) {
            println("Ingresa un valor válido para 'c'.")
            continue
        }

        val discriminante = b * b - 4 * a * c

        when {
            discriminante < 0 -> {
                println("La ecuación no tiene soluciones reales.")
            }
            discriminante == 0.0 -> {
                val x = -b / (2 * a)
                println("La ecuación tiene una única solución real: x = $x")
            }
            else -> {
                val x1 = (-b + sqrt(discriminante)) / (2 * a)
                val x2 = (-b - sqrt(discriminante)) / (2 * a)
                println("Las soluciones reales son:")
                println("x1 = $x1")
                println("x2 = $x2")
            }
        }

        break
    }
}