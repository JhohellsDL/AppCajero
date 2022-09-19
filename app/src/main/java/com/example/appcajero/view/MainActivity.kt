package com.example.appcajero.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appcajero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numero: Int
        var numero2: Int
        var suma :Int

        binding.btnSumar.setOnClickListener {
            numero = binding.nro1.text.toString().toInt()
            numero2 = binding.num1.text.toString().toInt()
            suma = numero + numero2

            binding.sum.text = "la suma de lo que ingresate es $suma"
            //comentario 2
            //comentario 2.1
            //Toast.makeText(this,"la suma de lo que ingresate es $suma",Toast.LENGTH_LONG).show()
        }
    }
}