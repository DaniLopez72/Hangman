package com.example.hangman

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Inicio:Activity() {
    private lateinit var inicio:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        inicio=findViewById(R.id.button)


    }
    public fun Iniciar(view: View){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}