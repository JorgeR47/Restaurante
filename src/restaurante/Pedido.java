package restaurante;

public class Pedido {
    private static int contadorID = 0; // Contador para IDs únicos
    private int idPedido;
    private Comensal comensal;
    private StringBuilder platos;
    private double total;
    private static final double PORCENTAJE_IVA = 0.15;

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

    public double calcularSubtotal() {
        return total;
    }

    public double calcularIVA() {
        return calcularSubtotal() * PORCENTAJE_IVA;
    }

    public double calcularTotalConIVA() {
        return calcularSubtotal() + calcularIVA();
    }

    public void imprimirFactura() {
        StringBuilder factura = new StringBuilder();
        factura.append("\n=== Factura del Pedido #").append(idPedido).append(" ===\n")
                .append("Cédula: ").append(comensal.getCedulaComensal()).append("\n")
                .append("Comensal: ").append(comensal.getNombreComensal()).append("\n\n")
                .append("Detalle de platos:\n")
                .append(platos)
                .append("\nSubtotal: $").append(String.format("%.2f", calcularSubtotal())).append("\n")
                .append("Tarifa 15%: $").append(String.format("%.2f", calcularIVA())).append("\n")
                .append("Total: $").append(String.format("%.2f", calcularTotalConIVA())).append("\n")
                .append("===============================\n");

        System.out.println(factura.toString());
    }
}