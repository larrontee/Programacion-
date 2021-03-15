package tema7.prueba;

import java.util.ArrayList;
import java.util.List;

public class Unidad {
    String Nombre;
    List<Alumno> alumnos;

    public Unidad(String nombre) {
        Nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "Nombre='" + Nombre + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
