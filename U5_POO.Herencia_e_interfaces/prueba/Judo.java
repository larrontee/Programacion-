package tema5.prueba;

import java.util.Arrays;

public class Judo extends Deportes{
    protected int Ntatami;

    public Judo(String nombre_deporte, String nombre_pabllon, int ntatami) {
        super(nombre_deporte, nombre_pabllon);
        Ntatami = ntatami;
    }

    public int getNtatami() {
        return Ntatami;
    }

    public void setNtatami(int ntatami) {
        Ntatami = ntatami;
    }

    @Override
    public String toString() {
        return "Judo{" +
                "nombre_deporte='" + nombre_deporte + '\'' +
                ", nombre_pabllon='" + nombre_pabllon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                ", Ntatami=" + Ntatami +
                '}';
    }
}
