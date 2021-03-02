package com.company;

public class PrendaColgada extends Prenda{
    private int altura;

    public PrendaColgada(int precio, String nombre_prenda, String codigo_barras, int peso, int altura) {
        super(precio, nombre_prenda, codigo_barras, peso);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+ nombre_prenda+"no se podra doblar");
    }

    public void colgar(){
        System.out.println("La prenda "+ nombre_prenda+" esta colgada");
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "precio=" + precio +
                ", nombre_prenda='" + nombre_prenda + '\'' +
                ", codigo_barras='" + codigo_barras + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
