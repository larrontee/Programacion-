package com.company;

import java.util.Arrays;

public class Caja {
    private Prenda[] prendas;
    private int capmax;
    private int peso;

    public Caja() {
        this.prendas = new Prenda[0];
        this.capmax = 5;
        this.peso = peso;
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prenda[] prendas) {
        this.prendas = prendas;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setCapmax(int capmax) {
        this.capmax = capmax;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void addPrenda(Prenda prenda){
        if (prendas.length<capmax){
            prendas=Arrays.copyOf(prendas,prendas.length+1);
            prendas[prendas.length-1]=prenda;
        } else{
            System.out.println("Esta caja esta llena");
        }
    }

    public void eliminarPrenda(Prenda prenda){
        Prenda[] prendas2= new Prenda[0];

        for (int i = 0; i < prendas.length; i++) {
            if (!prenda.equals(prendas[i])){
                prendas2=Arrays.copyOf(prendas2,prendas2.length+1);
                prendas2[prendas2.length-1]=prendas[i];
            }
        }
        prendas=prendas2;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "prendas=" + Arrays.toString(prendas) +
                ", capmax=" + capmax +
                ", peso=" + peso +
                '}';
    }
}
