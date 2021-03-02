package com.company;

import java.util.Arrays;

public class CamionPrenda extends Vehiculo implements Comparable<CamionPrenda>{
    private PrendaColgada[] lista_prendacolgada;

    public CamionPrenda(String matricula, int carga_max, Conductor conductor) {
        super(matricula, carga_max, conductor);
        this.lista_prendacolgada = new PrendaColgada[0];
    }

    public PrendaColgada[] getLista_prendacolgada() {
        return lista_prendacolgada;
    }

    public void setLista_prendacolgada(PrendaColgada[] lista_prendacolgada) {
        this.lista_prendacolgada = lista_prendacolgada;
    }



    public void addPrendaColgada(PrendaColgada prenda){
        lista_prendacolgada=Arrays.copyOf(lista_prendacolgada,lista_prendacolgada.length+1);
        lista_prendacolgada[lista_prendacolgada.length-1]=prenda;
    }

    public void eliminarPrendaColgada(PrendaColgada prenda){
        PrendaColgada[] prendasColgadas2= new PrendaColgada[0];

        for (int i = 0; i < lista_prendacolgada.length; i++) {
            if (!prenda.equals(lista_prendacolgada[i])){
                prendasColgadas2=Arrays.copyOf(prendasColgadas2,prendasColgadas2.length+1);
                prendasColgadas2[prendasColgadas2.length-1]=lista_prendacolgada[i];
            }
        }
        lista_prendacolgada=prendasColgadas2;
    }



    @Override
    public void descargar() {
        System.out.println("Descargando "+ lista_prendacolgada.length+" prendas.");
    }

    @Override
    public String toString() {
        return "CamionPrenda{" +
                "lista_prendacolgada=" + Arrays.toString(lista_prendacolgada) +
                ", matricula='" + matricula + '\'' +
                ", carga_max=" + carga_max +
                ", conductor=" + conductor +
                '}';
    }

    @Override
    public int compareTo(CamionPrenda o) {
        return this.lista_prendacolgada.length-o.lista_prendacolgada.length;
    }
}
