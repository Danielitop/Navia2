# Navia2
TaskTracker

TaskTracker es una aplicación en Kotlin para gestionar tareas. Permite crear, listar y actualizar tareas con diferentes estados (Pendiente, En progreso, Completada).

Estructura del proyecto

src/main/kotlin/com/puertadaniel/tasktracker/
│── Main.kt # Punto de entrada de la aplicación
│
├── model/
│ ├── Tarea.kt # Clase de modelo para representar una tarea
│ └── enums/
│ └── EstadoTarea.kt # Enumeración de estados de una tarea
│
├── service/
│ └── GestorTareas.kt # Lógica de negocio (gestión de tareas)
│
└── ui/
└── ConsolaUI.kt # Interfaz de usuario en consola

Ejecución

Clona el repositorio o descarga los archivos.

Abre el proyecto en IntelliJ IDEA (o cualquier IDE compatible con Kotlin).

Asegúrate de tener configurado Kotlin SDK.

Ejecuta el archivo Main.kt.

Funcionalidades

Crear tareas con título y descripción.

Listar todas las tareas con su estado.

Cambiar el estado de una tarea (Pendiente, En progreso, Completada).



Autor

Desarrollado por Daniel Puerta
