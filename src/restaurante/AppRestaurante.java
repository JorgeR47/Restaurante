package restaurante;

public class AppRestaurante {
    public static void main(String[] args) {
        // Crear comensales
        Comensal comensal1 = new Comensal("Juan Pérez", "1234567890");
        Comensal comensal2 = new Comensal("Luis Sanchez", "1751234509");


        // Crear platos
        Plato plato1 = new Plato("Pizza", 12.99, true);
        Plato plato2 = new Plato("Pasta", 10.50, true);
        Plato plato3 = new Plato("Ensalada", 2.75, false); // No disponible
        Plato plato4 = new Plato("Milanesa", 6.10, true);
        Plato plato5 = new Plato("Lasagna", 13.40, true);


        String menu = Plato.generarMenu();
        System.out.println("\n--- Menú del Restaurante ---");
        System.out.println(menu);
        // Crear mesero
        Mesero mesero1 = new Mesero("Carlos", 1);

        // El mesero crea un pedido para el comensal
        Pedido pedido1 = mesero1.crearPedido(comensal1);
        Pedido pedido2 = mesero1.crearPedido(comensal2);

        // El mesero asigna platos al pedidos
        mesero1.entregarPedido(pedido1, plato1, plato2, plato3,plato2,plato3);
        mesero1.entregarPedido(pedido2, plato1, plato5, plato4,plato3,plato1);

        // Imprimir factura del pedido
        pedido1.imprimirFactura();
        pedido2.imprimirFactura();
    }
}