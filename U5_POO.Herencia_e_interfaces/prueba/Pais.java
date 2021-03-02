package tema5.prueba;

public class Pais implements Comparable<Pais>{
    protected String Nombre;
    protected int Nparticipantes;

    public Pais(String nombre, int nparticipantes) {
        Nombre = nombre;
        Nparticipantes = nparticipantes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNparticipantes() {
        return Nparticipantes;
    }

    public void setNparticipantes(int nparticipantes) {
        Nparticipantes = nparticipantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "Nombre='" + Nombre + '\'' +
                ", Nparticipantes=" + Nparticipantes +
                '}';
    }



    @Override
    public int compareTo(Pais o) {
        return this.Nombre.compareTo(o.Nombre);
    }
/*
    @Override
    public int compareTo(Pais o) {
        return this.Nparticipantes-o.Nparticipantes;
    }*/
}
