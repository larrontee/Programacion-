package ej2;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Consulta implements Serializable {
    String fechaConsulta;
    String diagnostico;
    Set medicinas;

    public Consulta(String fechaConsulta, String diagnostico) {
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.medicinas = new HashSet();
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Set getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(Set medicinas) {
        this.medicinas = medicinas;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fechaConsulta='" + fechaConsulta + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", medicinas=" + medicinas +
                '}';
    }
}
