package ej1;

import java.util.Arrays;

public class AltavozTV extends Altavoz{
    private TipoInterfaz interfaz;

    public AltavozTV(int numSerie, int ancho, int alto, TipoInterfaz interfaz) {
        super(numSerie, ancho, alto);
        this.interfaz = interfaz;
    }

    public TipoInterfaz getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(TipoInterfaz interfaz) {
        this.interfaz = interfaz;
    }

    @Override
    public String toString() {
        return "AltavozTV{" +
                "numSerie=" + numSerie +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", listarevisiones=" + Arrays.toString(listarevisiones) +
                ", interfaz=" + interfaz +
                '}';
    }
}
