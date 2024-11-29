package restaurante;
/*
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Comensal comensal;
    private Mesero mesero;
    private List<Plato> platos;

    public Pedido (Comensal comensal, Mesero mesero){

        this.comensal = comensal;
        this.mesero = mesero;
        this.platos = new ArrayList<>();
    }
    public void agregarPlato (Plato plato){
        platos.add(plato);
    }

    public void imprimirPedido(){

        System.out.println(comensal);
        System.out.println(mesero);
        System.out.println("Lo que pidio es: ");
        for (Plato plato : platos){
            System.out.println(plato);
        }
    }


}
*/
/*
public class Pedido {
    private static int idContador;
    private final int idPedido;
    private Comensal comensal;
    private NodoPlato inicio; // Inicio de la lista enlazada de platos
    private boolean estado; // Indica si el pedido está listo o no

    // Constructor
    public Pedido(Comensal comensal) {
        this.idPedido = ++idContador;
        this.comensal = comensal;
        this.inicio = null; // Inicialmente no hay platos
        this.estado = false;
    }

    // Métodos para manejar la lista enlazada
    public void agregarPlato(Plato plato, int cantidad) {
        NodoPlato nuevoNodo = new NodoPlato(plato, cantidad);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoPlato actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public double calcularTotal() {
        double total = 0;
        NodoPlato actual = inicio;
        while (actual != null) {
            total += actual.plato.getPrecio() * actual.cantidad;
            actual = actual.siguiente;
        }
        return total;
    }

    public String generarFacturaPedido() {
        StringBuilder factura = new StringBuilder();
        factura.append(String.format("Pedido número: %d a nombre de %s.\n", idPedido, comensal.getNombreComensal()));
        factura.append("Platos solicitados:\n");

        NodoPlato actual = inicio;
        while (actual != null) {
            factura.append(String.format("- %s x%d: %.2f\n",
                    actual.plato.getNombrePlato(),
                    actual.cantidad,
                    actual.plato.getPrecio() * actual.cantidad));
            actual = actual.siguiente;
        }

        factura.append(String.format("Total: %.2f\n", calcularTotal()));
        return factura.toString();
    }

    public void actualizarEstado() {
        this.estado = !this.estado;
    }

    public boolean getEstado() {

        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
} */
public class Pedido {
    private static int contadorID = 0; // Contador para IDs únicos
    private int idPedido;
    private Comensal comensal;
    private StringBuilder platos;
    private double total;

    public Pedido(Comensal comensal) {
        this.idPedido = ++contadorID;
        this.comensal = comensal;
        this.platos = new StringBuilder();
        this.total = 0.0;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Comensal getComensal() {
        return comensal;
    }

    public void recibirPedidoDelMesero(Mesero mesero, Plato plato) {
        if (plato.estaDisponible()) {
            platos.append("Plato: ").append(plato.getNombre())
                    .append(", Precio: $").append(plato.getPrecio()).append("\n");
            total += plato.getPrecio(); // Actualiza el total
            System.out.println("El mesero " + mesero.getNombre() + " agregó el plato '"
                    + plato.getNombre() + "' al pedido #" + idPedido);
        } else {
            System.out.println("El plato '" + plato.getNombre() + "' no está disponible.");
        }
    }

    public double calcularTotal() {
        return total; // Devuelve el total acumulado
    }

    public void imprimirFactura() {
        System.out.println("Factura del Pedido #" + idPedido);
        System.out.println("Cedula: " + comensal.getCedulaComensal());
        System.out.println("Comensal: " + comensal.getNombreComensal());
        System.out.println(platos.toString());
        System.out.println("Total: $" + calcularTotal());
    }
}