package com.example.introkotlin_901.temasKotlin

import kotlin.math.PI
import kotlin.math.pow


fun main() {
    var opcion: Int

    while (true) {
        println("\n--- Generador de ares de figuras ---")
        println("1. Círculo")
        println("2. Cuadrado")
        println("3. Pentágono Regular")
        println("4. Triángulo")
        println("5. Salir")
        print("Seleccione una opción: ")

        opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion == 5) {
            println("Saliendo del programa...")
            break
        }

        if (opcion == 1) {
            print("Ingrese el radio del círculo: ")
            val radio = readLine()?.toDoubleOrNull() ?: 0.0
            if (radio > 0) {
                val area = PI * radio.pow(2)
                println("El área del círculo es: %.2f".format(area))
            } else {
                println("Valor de radio inválido.")
            }
        } else if (opcion == 2) {
            print("Ingrese la medida de uno de los lados del cuadrado: ")
            val lado = readLine()?.toDoubleOrNull() ?: 0.0
            if (lado > 0) {
                val area = lado * lado
                println("El área del cuadrado es: %.2f".format(area))
            } else {
                println("Valor de lado inválido.")
            }
        } else if (opcion == 3) {
            print("Ingrese la longitud del lado del pentágono: ")
            val lado = readLine()?.toDoubleOrNull() ?: 0.0
            print("Ingrese la apotema del pentágono: ")
            val apotema = readLine()?.toDoubleOrNull() ?: 0.0
            if (lado > 0 && apotema > 0) {
                val perimetro = 5 * lado
                val area = (perimetro * apotema) / 2
                println("El área del pentágono regular es: %.2f".format(area))
            } else {
                println("Valores de lado o apotema inválidos.")
            }
        } else if (opcion == 4) {
            print("Ingrese la base del triángulo: ")
            val base = readLine()?.toDoubleOrNull() ?: 0.0
            print("Ingrese la altura del triángulo: ")
            val altura = readLine()?.toDoubleOrNull() ?: 0.0
            if (base > 0 && altura > 0) {
                val area = (base * altura) / 2
                println("El área del triángulo es: %.2f".format(area))
            } else {
                println("Valores de base o altura inválidos.")
            }
        } else {
            println("Opción no válida. Por favor, intente de nuevo.")
        }
        println("----------------------------")
    }
}