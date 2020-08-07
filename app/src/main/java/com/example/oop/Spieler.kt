package com.example.oop

data class Spieler(var name : String, var punkte: Int) {

    fun gewinnt() {
        punkte = punkte + 10
    }
}