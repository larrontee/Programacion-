package tema4.prueba;

import java.util.Arrays;

public class Departamento {

    private String nombre_depart;
    private String sede;
    private String extension;
    private Empleado[] empleados;

    public Departamento(String nombre_depart, String sede, String extension) {
        this.nombre_depart = nombre_depart;
        this.sede = sede;
        this.extension = extension;
        this.empleados = empleados;
    }
    public Departamento(String nombre_depart, String extension) {
        this.nombre_depart = nombre_depart;
        this.sede = "castilleja";
        this.extension = extension;
        this.empleados = empleados;
    }

    public String getNombre_depart() {
        return nombre_depart;
    }

    public void setNombre_depart(String nombre_depart) {
        this.nombre_depart = nombre_depart;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }



    @Override
    public String toString() {
        return "Departamento{" +
                "nombre_depart='" + nombre_depart + '\'' +
                ", sede='" + sede + '\'' +
                ", extension='" + extension + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}