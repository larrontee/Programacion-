package ej1;

import java.util.Objects;

public class Revision implements Comparable<Revision>{
    private String fechaRev;
    private boolean buenEstado;
    private int precio;

    public Revision(String fechaRev, boolean buenEstado, int precio) {
        this.fechaRev = fechaRev;
        this.buenEstado = buenEstado;
        this.precio = precio;
    }

    public String getFechaRev() {
        return fechaRev;
    }

    public void setFechaRev(String fechaRev) {
        this.fechaRev = fechaRev;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public void setBuenEstado(boolean buenEstado) {
        this.buenEstado = buenEstado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Revision o) {
        return o.getPrecio()-this.getPrecio();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revision revision = (Revision) o;
        return fechaRev.equals(revision.fechaRev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaRev);
    }
}
