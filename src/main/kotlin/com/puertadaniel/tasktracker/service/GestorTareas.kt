package com.puertadaniel.tasktracker.service

import com.puertadaniel.tasktracker.model.Tarea

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun listarTareas(): List<Tarea> {
        return tareas
    }

    fun buscarPorId(id: Int): Tarea? {
        return tareas.find { it.id == id }
    }
}
