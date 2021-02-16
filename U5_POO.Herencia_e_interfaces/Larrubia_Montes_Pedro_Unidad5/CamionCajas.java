package com.company;

import java.util.Arrays;

public class CamionCajas extends Vehiculo implements Comparable<CamionCajas>{
    private Caja[] lista_cajas;

    public CamionCajas(String matricula, int carga_max, Conductor conductor) {
        super(matricula, carga_max, conductor);
        this.lista_cajas = new Caja[0];
    }

    public Caja[] getLista_cajas() {
        return lista_cajas;
    }

    public void setLista_cajas(Caja[] lista_cajas) {
        this.lista_cajas = lista_cajas;
    }

    public void addCaja(Caja caja){

        lista_cajas=Arrays.copyOf(lista_cajas,lista_cajas.length+1);
        lista_cajas[lista_cajas.length-1]=caja;
    }

    public void eliminarCaja(Caja caja){
        Caja[] lista_cajas2= new Caja[0];

        for (int i = 0; i < lista_cajas.length; i++) {
            if (!caja.equals(lista_cajas[i])){
                lista_cajas2=Arrays.copyOf(lista_cajas2,lista_cajas2.length+1);
                lista_cajas2[lista_cajas2.length-1]=lista_cajas[i];
            }
        }
        lista_cajas=lista_cajas2;
    }


    @Override
    public void descargar() {
        System.out.println("Descargando "+lista_cajas.length +" cajas y "/*+ lista_cajas[0].getPrendas().length*/);
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "lista_cajas=" + Arrays.toString(lista_cajas) +
                ", matricula='" + matricula + '\'' +
                ", carga_max=" + carga_max +
                ", conductor=" + conductor +
                '}';
    }

    @Override
    public int compareTo(CamionCajas o) {
        return this.lista_cajas.length-o.lista_cajas.length;
    }


}
