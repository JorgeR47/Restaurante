package restaurante;
public class Mesero {
    private String nombre;
    private int idMesero;

    public Mesero(String nombre, int idMesero) {
        this.nombre = nombre;
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    // Crear un pedido para un comensal
    public Pedido crearPedido(Comensal comensal) {
        Pedido nuevoPedido = new Pedido(comensal);
        System.out.println("El mesero " + nombre + " creó el pedido #" + nuevoPedido.getIdPedido()
                + " para el comensal " + comensal.getNombreComensal());
        return nuevoPedido;
    }

    // Entregar un pedido con platos
    public void entregarPedido(Pedido pedido, Plato... platos) {
        System.out.println("El mesero " + nombre + " está asignando platos al pedido #" + pedido.getIdPedido());

        for (Plato plato : platos) {
            pedido.recibirPedidoDelMesero(this, plato); // Agregar plato al pedido
        }

        System.out.println("El mesero " + nombre + " entregó el pedido #" + pedido.getIdPedido());
    }
}