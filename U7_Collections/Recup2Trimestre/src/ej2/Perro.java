package ej2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perro implements Serializable {
    private int pin;
    private String fechanacimiento;
    private String nombre;
    private int peso;
    private List<Consulta> listaConsultas;

    public Perro(int pin, String fechanacimiento, String nombre, int peso) {
        this.pin = pin;
        this.fechanacimiento = fechanacimiento;
        this.nombre = nombre;
        this.peso = peso;
        this.listaConsultas = new ArrayList<>();
    }
    public void addConsulta(Consulta c){
        listaConsultas.add(c);
    }
    public void removeConsulta(Consulta c){
        listaConsultas.remove(c);
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(List<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "pin=" + pin +
                ", fechanacimiento='" + fechanacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", listaConsultas=" + listaConsultas +
                '}';
    }
}
