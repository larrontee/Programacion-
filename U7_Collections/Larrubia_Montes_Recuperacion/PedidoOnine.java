import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class PedidoOnine extends Pedido implements Log{
    private String ipNavegador;
    private MetodoPago metodoPago;


    public PedidoOnine(int idPedido, String fechaRealizacion, String fechaEntrega, String ipNavegador, MetodoPago metodoPago) {
        super(idPedido, fechaRealizacion, fechaEntrega);
        this.ipNavegador = ipNavegador;
        this.metodoPago = metodoPago;
    }



    @Override
    public void printLog() {
        System.out.println("Fecha de preparacion: "+ fechaRealizacion + "\n"
                            +"Fecha de entrega: "+ fechaEntrega + "\n"
                            + "Metodo de pago: "+ metodoPago+ "\n"
                            + "Coste total del pedido " );
    }

    public String getIpNavegador() {
        return ipNavegador;
    }

    public void setIpNavegador(String ipNavegador) {
        this.ipNavegador = ipNavegador;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "PedidoOnine{" +
                "idPedido=" + idPedido +
                ", tiket=" + tiket +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", ipNavegador='" + ipNavegador + '\'' +
                ", metodoPago=" + metodoPago +
                '}';
    }
}

