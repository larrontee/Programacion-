package tema7.prueba;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IES {
    Map<Unidad, List<Alumno>> lista_clases;
    String nombreIes;

    public IES(String nombreIes) {
        this.lista_clases = new TreeMap<>();
        this.nombreIes = nombreIes;
    }

    public Map<Unidad, List<Alumno>> getLista_clases() {
        return lista_clases;
    }

    public void setLista_clases(Map<Unidad, List<Alumno>> lista_clases) {
        this.lista_clases = lista_clases;
    }

    public String getNombreIes() {
        return nombreIes;
    }

    public void setNombreIes(String nombreIes) {
        this.nombreIes = nombreIes;
    }
    public void addAlumnoUnidad (String id, Unidad unidad){

    }
    public void mostrarUnidadAlumno (String id){
    }

    @Override
    public String toString() {
        return "IES{" +
                "lista_clases=" + lista_clases +
                ", nombreIes='" + nombreIes + '\'' +
                '}';
    }
}