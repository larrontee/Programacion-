package com.company;

import java.util.Arrays;

public class Prenda implements Doblar{
    protected int precio;
    protected String nombre_prenda;
    protected String codigo_barras;
    protected int peso;
    protected Prenda[] totalprendas;

    public Prenda(int precio, String nombre_prenda, String codigo_barras, int peso) {
        this.precio = precio;
        this.nombre_prenda = nombre_prenda;
        this.codigo_barras = codigo_barras;
        this.peso = peso;
        this.totalprendas = new Prenda[0];
    }

    public Prenda[] getTotalprendas() {
        return totalprendas;
    }

    public void setTotalprendas(Prenda[] totalprendas) {
        this.totalprendas = totalprendas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_prenda() {
        return nombre_prenda;
    }

    public void setNombre_prenda(String nombre_prenda) {
        this.nombre_prenda = nombre_prenda;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }



    @Override
    public void doblar() {
        System.out.println("La prenda "+ nombre_prenda+" se podra doblar");
    }

    public void devolver(){
        System.out.println("Devolviendo la prenda con nombre "+ nombre_prenda+" y precio " +precio);
    }
    @Override
    public String toString() {
        return "Prenda{" +
                "precio=" + precio +
                ", nombre_prenda='" + nombre_prenda + '\'' +
                ", codigo_barras='" + codigo_barras + '\'' +
                ", peso=" + peso +
                ", totalprendas=" + totalprendas.length +
                '}';
    }
}
