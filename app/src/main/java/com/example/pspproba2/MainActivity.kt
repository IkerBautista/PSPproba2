package com.example.pspproba2

fun main() {
    val carrera = Atleta(0)
    val iker = Iteracion("iker", carrera)

    iker.start()
    iker.join()
}