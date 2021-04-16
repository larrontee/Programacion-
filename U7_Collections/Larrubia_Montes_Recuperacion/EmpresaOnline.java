import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class EmpresaOnline {
    private String nombreEmpresa;
    private Map<Integer,PedidoOnine> listaPedidos;

    public EmpresaOnline(String nombreEmpresa, Map<Integer, Pedido> listaPedidos) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaPedidos = new TreeMap<>();
    }
    public void escribirPedidosOnline(){
        try {
            ObjectOutputStream escribir= new ObjectOutputStream(new FileOutputStream("online.dat"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean vendidoProducto(Integer codigoProducto){
        ArrayList<PedidoOnine> pedidos= (ArrayList<PedidoOnine>) listaPedidos.values();
        for (Pedido p:pedidos) {
            TreeMap<Producto,Integer> listaProductos = (TreeMap<Producto, Integer>) p.tiket;
            ArrayList<Producto> productos= (ArrayList<Producto>) listaProductos.keySet();
            for (Producto prod:productos) {
                if (prod.codigo == codigoProducto){
                    return true;
                }
            }
        }
        return false;
    }


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Map<Integer, PedidoOnine> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(Map<Integer, PedidoOnine> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public String toString() {
        return "EmpresaOnline{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", listaPedidos=" + listaPedidos +
                '}';
    }
}
