package tema4.prueba;

import java.util.Calendar;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String NSS;
    private String tlf;
    private Calendar fecha_ini = Calendar.getInstance();
    private Tipo_empleado tipo;


    public Empleado(String nombre, String NSS, String tlf, Tipo_empleado tipo) {
        this.nombre = nombre;
        this.NSS = NSS;
        this.tlf = tlf;
        this.fecha_ini = Calendar.getInstance();
        this.tipo = tipo;

    }
    public Empleado(String nombre, String NSS, String tlf) {
        this(nombre,NSS,tlf,Tipo_empleado.TECNICO);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Calendar getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Calendar fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Tipo_empleado getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_empleado tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", NSS='" + NSS + '\'' +
                ", tlf='" + tlf + '\'' +
                ", fecha_ini=" + fecha_ini +
                ", tipo=" + tipo +
                '}';
    }
}