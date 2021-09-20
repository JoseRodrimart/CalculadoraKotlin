package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora_basica)
        val boton0: Button = findViewById(R.id.num0)
        boton0.setOnClickListener { Log.w("hola","hola") }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.num1 -> {/* do your code */}
            else -> {Log.w("boton","1")}
        }
    }
//    override fun onClick(v: View?) {
////        val texto: TextView = findViewById<TextView>(R.id.resultado)
//        Log.d("Boton Pulsado",v?.tag.toString())
//        //texto.text = v?.tag.toString()
//    }
}