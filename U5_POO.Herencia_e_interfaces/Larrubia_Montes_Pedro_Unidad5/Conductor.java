package com.company;

import java.util.Arrays;

public class Conductor {
    private String nombre_conductor;
    private String apellido;
    private String NSS;

    public Conductor(String nombre_conductor, String apellido, String NSS) {
        this.nombre_conductor = nombre_conductor;
        this.apellido = apellido;
        this.NSS = NSS;
    }

    public String getNombre_conductor() {
        return nombre_conductor;
    }

    public void setNombre_conductor(String nombre_conductor) {
        this.nombre_conductor = nombre_conductor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }



    @Override
    public String toString() {
        return "Conductor{" +
                "nombre_conductor='" + nombre_conductor + '\'' +
                ", apellido='" + apellido + '\'' +
                ", NSS='" + NSS + '\'' +
                '}';
    }
}
