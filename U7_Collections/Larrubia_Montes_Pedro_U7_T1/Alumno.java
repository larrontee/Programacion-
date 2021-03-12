package tema7.prueba;

public class Alumno implements Comparable<Alumno>{
    String nombre;
    String apellido;
    String dni;
    Unidad unidad;
    int id;
    public static int generator_id=1;

    public Alumno(String nombre, String apellido, String dni, Unidad unidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.unidad = unidad;
        this.id = generator_id;
        generator_id++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getGenerator_id() {
        return generator_id;
    }

    public static void setGenerator_id(int generator_id) {
        Alumno.generator_id = generator_id;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", unidad=" + unidad +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.id-o.id;
    }
}
