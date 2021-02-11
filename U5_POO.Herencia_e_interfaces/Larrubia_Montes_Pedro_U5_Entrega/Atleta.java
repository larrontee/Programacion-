package tema5.prueba;

public class Atleta extends Participante implements Correr{
    protected String nombre_prueba;

    public Atleta(String nombre, int edad, String nombre_prueba) {
        super(nombre, edad);
        this.nombre_prueba = nombre_prueba;
    }

    public String getNombre_prueba() {
        return nombre_prueba;
    }

    public void setNombre_prueba(String nombre_prueba) {
        this.nombre_prueba = nombre_prueba;
    }

    @Override
    public void hacerjuramento() {
        System.out.println( "Yo "+nombre+" , como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre_prueba='" + nombre_prueba + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void correr() {
        System.out.println("Voy a correr");
    }
}
