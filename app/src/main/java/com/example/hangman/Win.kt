package com.example.hangman

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class Win:Activity() {
    private lateinit var inicio:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.win)

        inicio=findViewById(R.id.button3)


    }
    public fun VolverAInicio(view: View){
        val i = Intent(this, Inicio::class.java)
        startActivity(i)
    }
}