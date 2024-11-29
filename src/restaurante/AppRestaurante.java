package restaurante;
/*
public class Restaurante {
    public static void main(String[] args) throws Exception {
        // Creamos Comensal, mesero y platos

        Comensal comensal = new Comensal("Luis Martinez");
        Mesero mesero = new Mesero("Juan Solis");
        Plato plato1 = new Plato("Cazuela de pescado", 5.99);
        Plato plato2 = new Plato("Arroz Marinero", 8.99);

        //Crear Pedidos y agregar Platos
        Pedido pedido = new Pedido(comensal, mesero);
        pedido.agregarPlato(plato1);
        pedido.agregarPlato(plato2);

        //Imprimir pedido

        pedido.imprimirPedido();
    }
}
*/
public class AppRestaurante {
    public static void main(String[] args) {
        // Crear comensales
        Comensal comensal1 = new Comensal("Juan Pérez", "1234567890");

        // Crear platos
        Plato plato1 = new Plato("Pizza", 12.99, true);
        Plato plato2 = new Plato("Pasta", 10.50, true);
        Plato plato3 = new Plato("Ensalada", 8.75, false); // No disponible

        // Crear mesero
        Mesero mesero1 = new Mesero("Carlos", 1);

        // El mesero crea un pedido para el comensal
        Pedido pedido1 = mesero1.crearPedido(comensal1);

        // El mesero asigna platos al pedido
        mesero1.entregarPedido(pedido1, plato1, plato2, plato3,plato2,plato3);

        // Imprimir factura del pedido
        pedido1.imprimirFactura();
    }
}