package com.example.pspproba2

class Iteracion (private var izena: String, private val Atleta : Atleta): Thread(){
    override fun run() {
        // lógica del hilo
        //.
            Atleta.carrera(izena)
    }
}
