fun main() {
    // Sueldo ingresado manualmente (puede venir de readLine() en consola)
    val sueldo: Double = 3250.0

    // ----------- IF: Evaluar si paga impuestos -----------
    if (sueldo > 3000) {
        println("Debe pagar impuestos")
    } else {
        println("No debe pagar impuestos")
    }

    // ----------- IF como expresión -----------
    val mensaje = if (sueldo > 3000) "Contribuyente activo" else "Exento de impuestos"
    println("Estado: $mensaje")

    // ----------- WHEN con rangos para categoría de sueldo -----------
    val categoria = when (sueldo) {
        in 0.0..1500.0 -> "Sueldo bajo"
        in 1500.01..3000.0 -> "Sueldo medio"
        in 3000.01..6000.0 -> "Sueldo alto"
        else -> "Sueldo fuera de rango"
    }
    println("Categoría de sueldo: $categoria")

    // ----------- WHEN con tipos (tipo de dato) -----------
    val dato: Any = sueldo
    when (dato) {
        is Int -> println("El sueldo es un número entero")
        is Double -> println("El sueldo es un número decimal")
        else -> println("Tipo de dato desconocido")
    }

    // ----------- Validación con rango (extra) -----------
    if (sueldo in 1000.0..5000.0) {
        println("El sueldo está dentro del rango normal")
    } else {
        println("El sueldo está fuera del rango normal")
    }
}