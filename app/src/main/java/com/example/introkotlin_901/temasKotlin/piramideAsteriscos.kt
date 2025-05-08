package com.example.introkotlin_901.temasKotlin

fun main() {
    var numeroIngresado: Int?
    val numeroParaDetener = 0
    val maxIntentosParaDetener = 2
    var intentosParaDetener = 0

    do {
        print("Ingrese un número (o $numeroParaDetener para salir): ")
        val input = readLine()
        numeroIngresado = input?.toIntOrNull()

        if (numeroIngresado == null || numeroIngresado < 0) {
            println("Entrada inválida. Por favor, ingrese un número entero positivo.")
            continue
        }

        if (numeroIngresado == numeroParaDetener) {
            intentosParaDetener++
            if (intentosParaDetener >= maxIntentosParaDetener) {
                println("Se ha ingresado '$numeroParaDetener' $maxIntentosParaDetener veces. Saliendo del programa...")
                break
            } else {
                println("Ingresó '$numeroParaDetener'. Faltan ${maxIntentosParaDetener - intentosParaDetener} vez/veces más para salir.")
                continue
            }
        } else {

            intentosParaDetener = 0
        }

        println("Imprimiendo patrón de $numeroIngresado asteriscos:")

        var i = 1
        do {
            var j = 1
            do {
                print("*")
                j++
            } while (j <= i)
            println()
            i++
        } while (i <= numeroIngresado)

        println("------------------------------")

    } while (true)
}