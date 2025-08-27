package main.kotlin.com.puertadaniel.tasktracker.model.enums

package com.puertadaniel.tasktracker.model

import com.puertadaniel.tasktracker.model.enums.EstadoTarea

data class Tarea(
    val id: Int,
    var titulo: String,
    var descripcion: String,
    var estado: EstadoTarea = EstadoTarea.PENDIENTE,
    val fechaCreacion: String
) {

    fun cambiarEstado(nuevoEstado: EstadoTarea) {
        this.estado = nuevoEstado
    }

    fun mostrarInfo(): String {
        return """
        ID: $id
        Título: $titulo
        Descripción: $descripcion
        Estado: ${estado.mostrarEstado()}
        Fecha de creación: $fechaCreacion
        """.trimIndent()
    }

    fun mostrarResumen(): String {
        return "[$id] $titulo - ${estado.mostrarEstado()}"
    }

    companion object {
        const val MAX_TITULO_LENGTH = 50

        fun validarTitulo(titulo: String): Boolean {
            return titulo.length <= MAX_TITULO_LENGTH
        }
    }
}
