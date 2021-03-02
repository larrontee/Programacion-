package tema5.prueba;

import java.util.Arrays;

public class Atletismo extends Deportes {
    protected int npruebas;

    public Atletismo(String nombre_deporte, String nombre_pabllon, int npruebas) {
        super(nombre_deporte, nombre_pabllon);
        this.npruebas = npruebas;
    }

    public int getNpruebas() {
        return npruebas;
    }

    public void setNpruebas(int npruebas) {
        this.npruebas = npruebas;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "npruebas=" + npruebas +
                ", nombre_deporte='" + nombre_deporte + '\'' +
                ", nombre_pabllon='" + nombre_pabllon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
