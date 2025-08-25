package com.puertadaniel.tasktracker.ui

object Menu {
    fun mostrarMenu() {
        println(
            """
            === Menú Principal ===
            1. Listar tareas
            2. Agregar tarea
            3. Cambiar estado de tarea
            4. Salir
            """.trimIndent()
        )
    }
}
