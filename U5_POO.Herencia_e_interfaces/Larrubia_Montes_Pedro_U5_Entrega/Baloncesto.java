package tema5.prueba;

import java.util.Arrays;

public class Baloncesto extends Deportes{
    protected int Nequipos;

    public Baloncesto(String nombre_deporte, String nombre_pabllon, int nequipos) {
        super(nombre_deporte, nombre_pabllon);
        Nequipos = nequipos;
    }

    public int getNequipos() {
        return Nequipos;
    }

    public void setNequipos(int nequipos) {
        Nequipos = nequipos;
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                "Nequipos=" + Nequipos +
                ", nombre_deporte='" + nombre_deporte + '\'' +
                ", nombre_pabllon='" + nombre_pabllon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
