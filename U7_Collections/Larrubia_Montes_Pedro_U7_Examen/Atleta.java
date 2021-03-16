public class Atleta {
    private String nombre;
    private String pais;
    private int marca;
    private Categoria categoria;
    private boolean finisher;
    private int dorsal;
    private static int generatordorsal=16;

    public Atleta() {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = marca;
        this.categoria = categoria;
        this.finisher = finisher;
        this.dorsal = generatordorsal;
        generatordorsal++;
    }
    public Atleta(String nombre, String pais, int marca, Categoria categoria, boolean finisher, int dorsal) {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = marca;
        this.categoria = categoria;
        this.finisher = finisher;
        this.dorsal = dorsal;
        generatordorsal++;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                ", dorsal=" + dorsal +
                '}';
    }
}
