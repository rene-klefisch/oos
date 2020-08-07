package com.example.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spieler1 : Spieler = Spieler("Thomas", 0)
        var spieler2 : Spieler = Spieler("Hanna", 0)

        button1.setOnClickListener {
            spieler1.gewinnt()
            textfeld.text = "Spieler ${spieler1.name} hat ${spieler1.punkte}, Spieler ${spieler2.name} hat ${spieler2.punkte}"
        }

        button2.setOnClickListener {
            spieler2.gewinnt()
            textfeld.text = "Spieler ${spieler1.name} hat ${spieler1.punkte}, Spieler ${spieler2.name} hat ${spieler2.punkte}"
        }
    }
}