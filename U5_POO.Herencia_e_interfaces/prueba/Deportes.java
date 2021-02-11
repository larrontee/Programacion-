package tema5.prueba;

import java.util.Arrays;

public abstract class Deportes {
    protected String nombre_deporte;
    protected String nombre_pabllon;
    protected Participante[] participantes;

    public Deportes(String nombre_deporte, String nombre_pabllon) {
        this.nombre_deporte = nombre_deporte;
        this.nombre_pabllon = nombre_pabllon;
        this.participantes = new Participante[0];
    }



    public String getNombre_deporte() {
        return nombre_deporte;
    }

    public void setNombre_deporte(String nombre_deporte) {
        this.nombre_deporte = nombre_deporte;
    }

    public String getNombre_pabllon() {
        return nombre_pabllon;
    }

    public void setNombre_pabllon(String nombre_pabllon) {
        this.nombre_pabllon = nombre_pabllon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public void anadirparticipante(Participante participante){
        Participante[] participantes1=participantes;
        participantes1=Arrays.copyOf(participantes1,participantes1.length+1);
        participantes1[participantes1.length-1]=participante;
        participantes=participantes1;
    }


    public void eliminarparticipante(Participante participante){
        Participante[] participante1=new Participante[participantes.length];

        for (int i = 0; i < participantes.length; i++) {
            if (!participante.equals(participantes[i])){
                participante1[i]=participantes[i];
            }
        }
        participantes=participante1;
    }


    @Override
    public String toString() {
        return "Deportes{" +
                "nombre_deporte='" + nombre_deporte + '\'' +
                ", nombre_pabllon='" + nombre_pabllon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
