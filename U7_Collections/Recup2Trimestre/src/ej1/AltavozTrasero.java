package ej1;

import java.util.Arrays;

public class AltavozTrasero extends AltavozCoche{

    private int w;
    private boolean adornos;

    public AltavozTrasero(int numSerie, int ancho, int alto, int w, boolean adornos) {
        super(numSerie, ancho, alto);
        this.w = w;
        this.adornos = adornos;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public boolean isAdornos() {
        return adornos;
    }

    public void setAdornos(boolean adornos) {
        this.adornos = adornos;
    }

    @Override
    public String toString() {
        return "AltavozTrasero{" +
                "numSerie=" + numSerie +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", listarevisiones=" + Arrays.toString(listarevisiones) +
                ", w=" + w +
                ", adornos=" + adornos +
                '}';
    }
}
