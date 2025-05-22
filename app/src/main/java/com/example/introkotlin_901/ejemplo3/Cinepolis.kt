package com.example.introkotlin_901.ejemplo3

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class Cinepolis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinepolis)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        val edtCompradores = findViewById<EditText>(R.id.edtCompradores)
        val edtBoletos = findViewById<EditText>(R.id.edtBoletos)
        val rbSi = findViewById<RadioButton>(R.id.rbSi)
        val rbNo = findViewById<RadioButton>(R.id.rbNo)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)


        btnCalcular.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val compradores = edtCompradores.text.toString().toIntOrNull() ?: 0
            val boletos = edtBoletos.text.toString().toIntOrNull() ?: 0


            if (nombre.isBlank() || compradores <= 0 || boletos <= 0) {
                mostrarAlerta("Por favor completa todos los campos correctamente.")
                return@setOnClickListener
            }

            val maxBoletos = compradores * 7
            if (boletos > maxBoletos) {
                mostrarAlerta("Solo se pueden comprar hasta 7 boletos por persona ($maxBoletos en total).")
                return@setOnClickListener
            }


            val precioBoleto = 12.0
            var total = boletos * precioBoleto


            total -= when {
                boletos >= 6 -> total * 0.15
                boletos in 3..5 -> total * 0.10
                else -> 0.0
            }


            if (rbSi.isChecked) {
                total -= total * 0.10
            }


            txtResultado.text = "Boletos a Pagar\n$${"%.2f".format(total)}"
        }
    }


    private fun mostrarAlerta(mensaje: String) {
        AlertDialog.Builder(this)
            .setTitle("Atención")
            .setMessage(mensaje)
            .setPositiveButton("OK", null)
            .show()
    }
}
