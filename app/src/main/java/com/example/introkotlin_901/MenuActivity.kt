package com.example.introkotlin_901

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.ejemplo1.SumaActivity
import com.example.introkotlin_901.ejemplo2.SaludoActivity
import com.example.introkotlin_901.ejemplo3.Cinepolis

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)


        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent = Intent(this, SumaActivity::class.java)
            startActivity(intent)
        }


        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        btnSaludo.setOnClickListener {
            navigateToSaludo()
        }


        val btnCinepolis = findViewById<Button>(R.id.btnCinepolis)
        btnCinepolis.setOnClickListener {
            val intent = Intent(this, Cinepolis::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToSaludo() {
        val intent = Intent(this, SaludoActivity::class.java)
        startActivity(intent)
    }
}

