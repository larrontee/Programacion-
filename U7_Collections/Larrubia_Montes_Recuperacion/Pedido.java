import java.nio.file.SecureDirectoryStream;
import java.util.*;

public abstract class Pedido {
    public static int contadorPedido=1;

    protected int idPedido;
    protected Map<Producto,Integer> tiket;
    protected String fechaRealizacion;
    protected String fechaEntrega;


    public Pedido(int idPedido, String fechaRealizacion, String fechaEntrega) {
        this.idPedido = idPedido;
        this.tiket = new TreeMap<>();
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntrega = fechaEntrega;
        contadorPedido++;
    }

    public void addProducto(Producto producto, int cant){
        if (!tiket.containsKey(producto)){
            tiket.put(producto,cant);
        }
        else {
            tiket.replace(producto,producto.cantidad+=cant);
        }
    }
    public boolean borrarPedido(Producto producto){
        if (tiket.containsKey(producto)){
            tiket.remove(producto);
            return true;
        }
        else{
            return false;
        }
    }
    public static int countPedidos(){
        return contadorPedido;
    }

    public void calcularTotal() {
        ArrayList<Producto> productos= (ArrayList<Producto>) tiket.keySet();
        int contador=0;
        for (Producto p: productos) {
            contador+=p.precio*tiket.get(p);
        }
        System.out.println(contador);
    }




    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Map<Producto, Integer> getTiket() {
        return tiket;
    }

    public void setTiket(Map<Producto, Integer> tiket) {
        this.tiket = tiket;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", tiket=" + tiket +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                '}';
    }
}
