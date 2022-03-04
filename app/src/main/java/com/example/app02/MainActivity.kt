package com.example.app02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
    //const val EXTRA_MESSAGE = "com.example.app02.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext, "onCreate()", Toast.LENGTH_SHORT)
        toast.show()
    }


    fun iniciarSesion(){
        val usuario =""
        val pass = ""
        val btnIniciarSecion = findViewById<Button>(R.id.btnIniciarSesion)
        val intent = Intent(this, Principal()::class.java).apply {}
        startActivity(intent)

    }

    fun Principal(view: View){
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val usuario = etNombre.text.toString()
        val TextPassword = findViewById<EditText>(R.id.TextPassword)
        val intent = Intent(this, Principal()::class.java).apply {}
        startActivity(intent)
    }

}