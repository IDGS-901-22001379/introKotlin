package com.example.introkotlin_901.temasKotlin

import kotlin.math.PI
import java.util.Scanner

// Clase base
abstract class Figura {
    abstract fun calcularArea(): Double
}

// Clases específicas
class Triangulo(private val base: Double, private val altura: Double) : Figura() {
    override fun calcularArea(): Double = (base * altura) / 2
}

class Rectangulo(private val base: Double, private val altura: Double) : Figura() {
    override fun calcularArea(): Double = base * altura
}

class Circulo(private val radio: Double) : Figura() {
    override fun calcularArea(): Double = PI * radio * radio
}

class Cuadrado(private val lado: Double) : Figura() {
    override fun calcularArea(): Double = lado * lado
}

class Pentagono(private val lado: Double, private val apotema: Double) : Figura() {
    override fun calcularArea(): Double = (5 * lado * apotema) / 2
}

// Función principal con menú
fun main() {
    val scanner = Scanner(System.`in`)
    var opcion: Int

    do {
        println("\n--- CÁLCULO DE ÁREAS ---")
        println("1. Triángulo")
        println("2. Rectángulo")
        println("3. Círculo")
        println("4. Cuadrado")
        println("5. Pentágono")
        println("0. Salir")
        print("Elige una opción: ")
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                print("Base: ")
                val base = scanner.nextDouble()
                print("Altura: ")
                val altura = scanner.nextDouble()
                val figura = Triangulo(base, altura)
                println("Área del triángulo: ${figura.calcularArea()}")
            }
            2 -> {
                print("Base: ")
                val base = scanner.nextDouble()
                print("Altura: ")
                val altura = scanner.nextDouble()
                val figura = Rectangulo(base, altura)
                println("Área del rectángulo: ${figura.calcularArea()}")
            }
            3 -> {
                print("Radio: ")
                val radio = scanner.nextDouble()
                val figura = Circulo(radio)
                println("Área del círculo: ${figura.calcularArea()}")
            }
            4 -> {
                print("Lado: ")
                val lado = scanner.nextDouble()
                val figura = Cuadrado(lado)
                println("Área del cuadrado: ${figura.calcularArea()}")
            }
            5 -> {
                print("Lado: ")
                val lado = scanner.nextDouble()
                print("Apotema: ")
                val apotema = scanner.nextDouble()
                val figura = Pentagono(lado, apotema)
                println("Área del pentágono: ${figura.calcularArea()}")
            }
            0 -> println("Saliendo del programa...")
            else -> println("Opción no válida")
        }
    } while (opcion != 0)
}