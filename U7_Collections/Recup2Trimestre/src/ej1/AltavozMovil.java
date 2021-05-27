package ej1;

import java.util.Arrays;

public class AltavozMovil extends Altavoz{
    private int peso;

    public AltavozMovil(int numSerie, int ancho, int alto, int peso) {
        super(numSerie, ancho, alto);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "AltavozMovil{" +
                "numSerie=" + numSerie +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", listarevisiones=" + Arrays.toString(listarevisiones) +
                ", peso=" + peso +
                '}';
    }
}
