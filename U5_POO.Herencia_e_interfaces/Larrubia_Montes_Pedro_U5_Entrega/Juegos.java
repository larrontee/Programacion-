package tema5.prueba;

import java.util.Arrays;

public class Juegos {
    protected int añocelebracion;
    protected String sede;
    protected Pais[] paises;
    protected Deportes[] deportes;

    public Juegos(int añocelebracion, String sede) {
        this.añocelebracion = añocelebracion;
        this.sede = sede;
        this.paises = new Pais[0];
        this.deportes = new Deportes[0];
    }

    public int getAñocelebracion() {
        return añocelebracion;
    }

    public void setAñocelebracion(int añocelebracion) {
        this.añocelebracion = añocelebracion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deportes[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deportes[] deportes) {
        this.deportes = deportes;
    }

    public void anadirpais(Pais pais){
        Pais[] pais1=paises;
        pais1=Arrays.copyOf(pais1,pais1.length+1);
        pais1[pais1.length-1]=pais;
        paises=pais1;
    }

    public void eliminarpais(Pais pais){
        Pais[] pais1=new Pais[paises.length];

        for (int i = 0; i < paises.length; i++) {
            if (!pais.equals(paises[i])){
                pais1[i]=paises[i];
            }
        }
        paises=pais1;
    }
    public void anadirdeporte(Deportes deporte){
        Deportes[] deportes1=deportes;
        deportes1=Arrays.copyOf(deportes1,deportes1.length+1);
        deportes1[deportes1.length-1]=deporte;
        deportes=deportes1;
    }

    public void eliminardeporte(Deportes deporte){
        Deportes[] deporte1=new Deportes[deportes.length];

        for (int i = 0; i < deportes.length; i++) {
            if (!deporte.equals(deportes[i])){
                deporte1[i]=deportes[i];
            }
        }
        deportes=deporte1;
    }


    public void mostrarPaises(){
        System.out.println(Arrays.toString(paises));
    }

    public void mostrarpais_paraceremonia(){

        System.out.println(Arrays.toString(paises));
    }
    public void mostrarParticipantes(){
        ;
    }
    public void mostrarJugadoresBaloncestoPorAltura(){

    }





    @Override
    public String toString() {
        return "Juegos{" +
                "añocelebracion=" + añocelebracion +
                ", sede='" + sede + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}