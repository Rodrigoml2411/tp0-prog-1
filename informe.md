# Informe del Trabajo Práctico

## Encapsulamiento
Se aplicó el principio de **encapsulamiento** en todas las clases, declarando los atributos como `private` y proporcionando métodos `getter` y `setter` públicos para acceder y modificar sus valores.  
Esto garantiza que los datos internos estén protegidos y solo puedan modificarse de manera controlada.

Por ejemplo:
```java
private String nombre;

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    if (nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre;
    }
}


Relaciones entre Clases

Se implementaron las siguientes relaciones:

Estudiante ↔ Materia:
Cada estudiante tiene una lista de materias (List<Materia> materias), lo que representa una relación "uno a muchos".
Además, se agregó un método calcularPromedio() que obtiene el promedio de calificaciones.

Carrera ↔ Estudiante:
La clase Carrera contiene una lista de estudiantes (List<Estudiante>) con métodos para agregar, listar y buscar estudiantes.

Validaciones en Setters

Se agregaron validaciones para garantizar la integridad de los datos:

La edad debe ser mayor a 16 años.

El promedio debe estar entre 0 y 10.

El nombre y apellido no pueden estar vacíos ni nulos.

Las calificaciones de las materias también deben estar entre 0 y 10.

Ejemplo:

public void setEdad(int edad) {
    if (edad > 16) {
        this.edad = edad;
    } else {
        this.edad = 17;
    }
}
