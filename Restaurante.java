
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
