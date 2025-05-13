package com.example.introkotlin_901.temasKotlin

class usuario(){
    val materia: String=""
}

class usuarios2(val  Int:Int, val nombre:String) {
    val materia:String=""
    fun hola(){
        println("Hola")
    }
}

fun main(){
    val alumno = usuario()
    val alumno2 = usuarios2(1, "Carlos")

    println(alumno2)
    println(alumno2.nombre)
    alumno2.hola()
}