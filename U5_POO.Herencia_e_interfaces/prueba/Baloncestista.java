package tema5.prueba;

public class Baloncestista extends Participante implements Encestar{
    protected float altura;

    public Baloncestista(String nombre, int edad, float altura) {
        super(nombre, edad);
        this.altura = altura;
    }




    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+nombre+" , como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Baloncestista{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }
}
