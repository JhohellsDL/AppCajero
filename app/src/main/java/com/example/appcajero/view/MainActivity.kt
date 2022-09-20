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

        var montoInicial = 0
        var numero: Int
        var numero2: Int
        var suma :Int
        var resta :Int

        binding.btnSumar.setOnClickListener {
            numero = binding.nro1.text.toString().toInt()
            //numero2 = binding.nro2.text.toString().toInt()
            montoInicial = montoInicial + numero

            binding.sum.text = "dinero actual $montoInicial"

            //Toast.makeText(this,"la suma de lo que ingresate es $suma",Toast.LENGTH_LONG).show()
            //cambios 3
        }
        binding.btnRestar.setOnClickListener {
            numero = binding.nro1.text.toString().toInt()
            //numero2 = binding.nro2.text.toString().toInt()
            //resta = numero - numero2
            montoInicial = montoInicial - numero

            binding.sum.text = "dinero actual $montoInicial"

        }
    }
}