package com.puertadaniel.tasktracker.utils

object FechaHelper {
    const val FORMATO_FECHA = "dd/MM/yyyy"

    fun obtenerFechaActual(): String {
        return "19/08/2025" // Hardcodeado por ahora
    }

    fun obtenerHoraActual(): String {
        return "15:00" // Hardcodeado por ahora
    }

    fun formatearFechaHora(): String {
        return "${obtenerFechaActual()} ${obtenerHoraActual()}"
    }
}
