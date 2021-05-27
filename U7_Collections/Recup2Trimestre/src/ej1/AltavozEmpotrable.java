package ej1;

import java.util.Arrays;

public class AltavozEmpotrable extends AltavozCoche{
    private EmpotradoEn sitio;

    public AltavozEmpotrable(int numSerie, int ancho, int alto, EmpotradoEn sitio) {
        super(numSerie, ancho, alto);
        this.sitio = sitio;
    }

    public EmpotradoEn getSitio() {
        return sitio;
    }

    public void setSitio(EmpotradoEn sitio) {
        this.sitio = sitio;
    }

    @Override
    public String toString() {
        return "AltavozEmpotrable{" +
                "numSerie=" + numSerie +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", listarevisiones=" + Arrays.toString(listarevisiones) +
                ", sitio=" + sitio +
                '}';
    }
}
