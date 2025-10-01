import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private List<Materia> materias;

    public Estudiante() {
        this.materias = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        this();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido";
        }
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            this.apellido = "Desconocido";
        }
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 16) {
            this.edad = edad;
        } else {
            this.edad = 17;
        }
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            this.promedio = 0;
        }
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
        calcularPromedio();
    }

    public void calcularPromedio() {
        if (materias.isEmpty()) {
            this.promedio = 0;
            return;
        }
        double suma = 0;
        for (Materia m : materias) {
            suma += m.getCalificacion();
        }
        this.promedio = suma / materias.size();
    }

    public List<Materia> getMaterias() { return materias; }
}

