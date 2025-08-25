package com.puertadaniel.tasktracker

import com.puertadaniel.tasktracker.model.Tarea
import com.puertadaniel.tasktracker.model.enums.EstadoTarea
import com.puertadaniel.tasktracker.utils.FechaHelper

fun main() {
    println("Lista de tareas:\n")

    // Test 1: Crear 4 tareas
    val tarea1 = Tarea(1, "Test", "Descripción", EstadoTarea.PENDIENTE, "19/08/2025")
    val tarea2 = Tarea(2, "Aprender Fundamentos en Kotlin", "Descripción", EstadoTarea.PENDIENTE, FechaHelper.obtenerFechaActual())
    val tarea3 = Tarea(3, "Practicar con Data Classes", "Descripción", EstadoTarea.PENDIENTE, FechaHelper.obtenerFechaActual())
    val tarea4 = Tarea(4, "Dominar Enums en Kotlin", "Descripción", EstadoTarea.PENDIENTE, FechaHelper.obtenerFechaActual())

    // Test 2: Cambiar estado de tareas 2 a 4
    tarea2.cambiarEstado(EstadoTarea.COMPLETADA)
    tarea3.cambiarEstado(EstadoTarea.EN_PROGRESO)
    tarea4.cambiarEstado(EstadoTarea.COMPLETADA)

    // Imprimir tareas
    val listaTareas = listOf(tarea1, tarea2, tarea3, tarea4)
    listaTareas.forEach { tarea ->
        println(tarea.mostrarInfo())
        println("----------------------------------------------------")
    }
}
