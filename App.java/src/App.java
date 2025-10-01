public class App {
    public static void main(String[] args) {

        // Crear estudiantes
        Estudiante e1 = new Estudiante();
        e1.setNombre("Juan");
        e1.setApellido("Pérez");
        e1.setEdad(20);
        e1.setCarrera("Ingeniería");
        e1.setPromedio(8.5);

        Estudiante e2 = new Estudiante("María", "Gómez", 22, "Ingeniería", 9.0);
        Estudiante e3 = new Estudiante("Luis", "Torres", 19, "Ingeniería", 7.5);

        // Arreglo de estudiantes
        Estudiante[] lista = { e1, e2, e3 };

        System.out.println("📋 Listado de Estudiantes:");
        for (Estudiante e : lista) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - Promedio: " + e.getPromedio());
        }

        // Crear materias y asignarlas
        Materia m1 = new Materia("Matemática", "MAT101", 6, 8.5);
        Materia m2 = new Materia("Programación", "PRG201", 8, 9.0);
        Materia m3 = new Materia("Base de Datos", "BD301", 6, 7.5);

        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        e2.agregarMateria(m1);
        e2.agregarMateria(m3);

        e3.agregarMateria(m2);
        e3.agregarMateria(m3);

        // Crear carrera
        Carrera ingenieria = new Carrera("Ingeniería en Sistemas");
        ingenieria.agregarEstudiante(e1);
        ingenieria.agregarEstudiante(e2);
        ingenieria.agregarEstudiante(e3);

        // Mostrar promedios actualizados
        System.out.println("\n🎓 Promedios actualizados:");
        for (Estudiante e : lista) {
            System.out.println(e.getNombre() + ": " + e.getPromedio());
        }

        // Listar todos los estudiantes
        System.out.println();
        ingenieria.listarEstudiantes();

        // Buscar estudiante
        Estudiante buscado = ingenieria.buscarEstudiante("María");
        if (buscado != null) {
            System.out.println("\n🔍 Estudiante encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
        } else {
            System.out.println("\nEstudiante no encontrado.");
        }
    }
}
