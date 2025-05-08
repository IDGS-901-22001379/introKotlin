package com.example.introkotlin_901.temasKotlin

fun main(){

    var readOnlyList:List<String> = listOf("lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println(readOnlyList)
    println("El primer dia es ${readOnlyList[0]}")
    println("El primer dia es ${readOnlyList.first()}")
    println("El numero de dias es ${readOnlyList.count()}")
    println("El numero de dias es ${readOnlyList.size}")
    println("Martes" in readOnlyList)
    var figuras : MutableList<String> = mutableListOf("Circulo", "Cuadrado", "Tringulo")
    println(figuras)
    figuras.add("Pentagono")
    println(figuras)
    figuras.removeAt(index = 0)
    println(figuras)
    figuras.remove(element = "Cuadrado")
    // ----------------------------------------------------------------------------------------------------
    val readOnlyFrutas = mapOf("manzana" to 1500, "platano" to 2000, "sandia" to 2500)
    println(readOnlyFrutas)
    println(readOnlyFrutas["manzana"])
    println(readOnlyFrutas.keys)
    println(readOnlyFrutas.values)




}