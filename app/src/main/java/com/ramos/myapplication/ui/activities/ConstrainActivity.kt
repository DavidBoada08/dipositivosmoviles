package com.ramos.myapplication.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ramos.myapplication.databinding.ActivityConstrainBinding
import com.ramos.myapplication.databinding.ActivityMainBinding

class ConstrainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConstrainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inicializo
        binding = ActivityConstrainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // let desempaqueta y manejo nulidad
        // "?" -> Si es que envio "extras" hago, sino deje nomas

        var idUser: Int? = null
        intent.extras?.let {
            dato -> idUser = dato.getInt("idUser")
        }

        if (idUser != null) {
            binding.editTextText2.setText(idUser.toString())
        } else {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
