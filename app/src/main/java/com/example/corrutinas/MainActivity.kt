package com.example.corrutinas

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    companion object{
        const val APP  ="corrutinas"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 1. cada 300 ml escribe palabra encontrada en un nuevo hilo
        GlobalScope.launch {
            (1..5).forEach {
                Log.i(APP, "¡Palabra $it encontrada!")
                Thread.sleep(300)
            }
        }

        // 2. El programa cuenta 1 cada 100 milisegundos
        for (i in 10 downTo 1) {
            Log.i(APP,"${i}s")
            Thread.sleep(100)
        }

        // 3. Se acaba el tiempo
        Log.i(APP,"Se terminó el tiempo")

    }
}