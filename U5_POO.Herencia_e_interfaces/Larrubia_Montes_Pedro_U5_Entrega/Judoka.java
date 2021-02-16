package tema5.prueba;

public class Judoka extends Participante implements Luchar{
    protected int peso;

    public Judoka(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void hacerjuramento() {
        System.out.println( "Yo "+nombre+" , como judoka, juro los valores deportivos mundiales");

    }

    @Override
    public String toString() {
        return "Judoka{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void lucahr() {
        System.out.println("Voy a luchar");
    }
}
