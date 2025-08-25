package com.puertadaniel.tasktracker.model.enums

enum class EstadoTarea(val descripcion: String, val simbolo: String) {
    PENDIENTE("Por hacer", "⏳"),
    EN_PROGRESO("En progreso", "🔄"),
    COMPLETADA("Completada", "✅");

    fun mostrarEstado(): String {
        return "$simbolo $descripcion"
    }

    companion object {
        fun fromOrdinal(ordinal: Int): EstadoTarea? {
            return if (ordinal in values().indices) values()[ordinal] else null
        }
    }
}
