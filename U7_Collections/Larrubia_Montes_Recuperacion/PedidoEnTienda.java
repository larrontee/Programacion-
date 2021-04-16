public class PedidoEnTienda extends Pedido{
    private String direccion;

    public PedidoEnTienda(int idPedido, String fechaRealizacion, String fechaEntrega, String direccion) {
        super(idPedido, fechaRealizacion, fechaEntrega);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "PedidoEnTienda{" +
                "idPedido=" + idPedido +
                ", tiket=" + tiket +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
