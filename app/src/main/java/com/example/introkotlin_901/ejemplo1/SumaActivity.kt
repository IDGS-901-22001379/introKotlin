package com.example.introkotlin_901.ejemplo1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.introkotlin_901.R

class SumaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma) // Este es tu archivo XML correcto

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val btn1 = findViewById<Button>(R.id.btn1)
        val tv1 = findViewById<TextView>(R.id.tv1)

        val rbSuma = findViewById<RadioButton>(R.id.rbSuma)
        val rbResta = findViewById<RadioButton>(R.id.rbResta)
        val rbMultiplicacion = findViewById<RadioButton>(R.id.rbMultiplicacion)
        val rbDivision = findViewById<RadioButton>(R.id.rbDivision)

        btn1.setOnClickListener {
            val numero1 = et1.text.toString().toDoubleOrNull()
            val numero2 = et2.text.toString().toDoubleOrNull()

            if (numero1 == null || numero2 == null) {
                tv1.text = "Ingresa números válidos"
                return@setOnClickListener
            }

            val resultado = when {
                rbSuma.isChecked -> numero1 + numero2
                rbResta.isChecked -> numero1 - numero2
                rbMultiplicacion.isChecked -> numero1 * numero2
                rbDivision.isChecked -> {
                    if (numero2 == 0.0) {
                        tv1.text = "Error: División por cero"
                        return@setOnClickListener
                    }
                    numero1 / numero2
                }
                else -> {
                    tv1.text = "Selecciona una operación"
                    return@setOnClickListener
                }
            }

            tv1.text = "Resultado = $resultado"
        }
    }
}
