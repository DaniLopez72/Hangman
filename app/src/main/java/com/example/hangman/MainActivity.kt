package com.example.hangman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var newWord:String
    lateinit var gameWord:TextView
    lateinit var letterSelected:EditText
    lateinit var hangmanImage:ImageView

    var finished:Int = Hangman.ganar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gameWord=findViewById(R.id.word)
        letterSelected=findViewById(R.id.letter)
        hangmanImage=findViewById(R.id.hangman)
        Hangman.GetRandomWord();

        PrintWord()

    }
    public fun PrintWord(){
        newWord =Hangman.GetWordInGame()
        gameWord.text=newWord
        letterSelected.text=null
        hangmanImage.setImageResource(Words.imageError[Hangman.errorCount])
    }
    public fun CheckLetter(view: View){
        Hangman.AddLetter(letterSelected.text.toString())
        CheckWin()
        PrintWord()
    }
    public fun CheckWin(){
        if (Hangman.ganar == 1){
            val i = Intent(this, Win::class.java)
            startActivity(i)
        }
        else if (Hangman.ganar == 2){
            val i = Intent(this, Lose::class.java)
            startActivity(i)
        }
    }
}