package com.example.pspproba2

class Atleta(private var metros: Int) {
    fun getMetros(): Int = metros

    fun carrera(Izena: String){
        while (metros < 100){
            var n = (1..100).random()
            metros += n
            println("$Izena ha avanzado $n metros, total: $metros")
            Thread.sleep(100)

        }
        println("$Izena ha llegado a la meta")
    }
}