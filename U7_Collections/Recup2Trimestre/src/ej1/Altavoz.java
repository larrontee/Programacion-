package ej1;

import java.util.Arrays;
import java.util.Objects;

public abstract class Altavoz {
    protected int numSerie;
    protected int ancho;
    protected int alto;
    protected Revision[] listarevisiones;
    public static int contador = 0;

    public Altavoz(int numSerie, int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.numSerie = numSerie;
        this.listarevisiones = new Revision[0];
        contador++;
    }
    public void addReview(Revision r){
        listarevisiones=new Revision[listarevisiones.length+1];
        for (int i = 0; i < listarevisiones.length; i++) {
            if (!listarevisiones[i].equals(r)){
                listarevisiones[listarevisiones.length-1]=r;
            }else{
                System.out.println("la revision introducida tiene la misma fecha que otra");
            }
        }
    }
    public boolean delReview(Revision r){
        Revision[] aux=new Revision[0];
        for (int i = 0; i < listarevisiones.length; i++) {
            if (!listarevisiones.equals(r)){
                aux=Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1]=getListarevisiones()[i];
            }
        }
        if (aux.length==getListarevisiones().length){
            return false;
        }
        setListarevisiones(aux);
        return true;
    }

    public static int numAltavocesCreados() {
        return contador;
    }
    public void mostrarRevisiones(Altavoz a){
        Arrays.sort(a.getListarevisiones());
        System.out.println(listarevisiones);
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Revision[] getListarevisiones() {
        return listarevisiones;
    }

    public void setListarevisiones(Revision[] listarevisiones) {
        this.listarevisiones = listarevisiones;
    }

    @Override
    public String toString() {
        return "Altavoz{" +
                "numSerie=" + numSerie +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", listarevisiones=" + Arrays.toString(listarevisiones) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Altavoz altavoz = (Altavoz) o;
        return numSerie == altavoz.numSerie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numSerie);
    }
}
