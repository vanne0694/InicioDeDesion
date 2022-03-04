package com.example.app02

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.Instant

class Principal : AppCompatActivity() {
    //@RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
       // val horaActual = Instant.now()
        //println(horaActual)
    }

    fun DatosUsuario(view: View){
        val btnDatosUsuario = findViewById<Button>(R.id.btnDatosUs)
        val intent = Intent(this, DatosUsuario::class.java).apply {}
        startActivity(intent)
    }

    fun DatosIntitucion(view: View){
        val btnIntitucion = findViewById<Button>(R.id.btnInstitucion)
        val intent = Intent(this, DatosIntitucion::class.java).apply {}
        startActivity(intent)
    }

    fun Asignaturas(view: View){
        val btnAsignaturas = findViewById<Button>(R.id.btnAsignaturas)
        val intent = Intent(this, DatosAsignaturas::class.java).apply {}
        startActivity(intent)
    }

    fun Aviso(view: View){
        val btnAvisos= findViewById<Button>(R.id.btnAviso)
        val intent = Intent(this, Avisos::class.java).apply {}
        startActivity(intent)
    }

    fun DatosDeAplicacion(view: View){
        val btnApp= findViewById<Button>(R.id.btnApp)
        val intent = Intent(this, DatosApp::class.java).apply {}
        startActivity(intent)
    }
}