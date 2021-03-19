package tema4.prueba;

import java.util.Arrays;

public class Empresa {
    private String nombre_empresa;
    private Departamento[] departamentos;

    public Empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
        this.departamentos = departamentos;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre_empresa='" + nombre_empresa + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}