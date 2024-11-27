package restaurante;
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
}

 */
