package restaurante;

public class Impresion {
    public static void main(String[] args) {
        // Crear objetos iniciales
        Mesero mesero = new Mesero("Juan");
        Comensal comensal = new Comensal("Ana");
        Plato plato1 = new Plato("Lasaña", 8.50);
        Plato plato2 = new Plato("Ensalada César", 5.20);

        // Crear un pedido y agregar platos
        Pedido pedido = mesero.tomarPedido(comensal);
        pedido.agregarPlato(plato1);
        pedido.agregarPlato(plato2);

        // Imprimir menú
        System.out.println("\n--- Menú ---");
        System.out.println(plato1);
        System.out.println(plato2);

        // Imprimir pedido completo
        System.out.println("\n--- Detalles del Pedido ---");
        System.out.println(pedido);

        // Comensal consume el plato
        comensal.consumirPlato(pedido);
    }
}

// Clase Plato: Representa un plato del menú
class Plato {
    private String nombre;
    public double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato: " + nombre + ", Precio: $" + precio;
    }
}

// Clase Pedido: Composición con Plato
class Pedido {
    private String id;
    private StringBuilder detalles = new StringBuilder();
    private double total = 0;

    public Pedido(String id) {
        this.id = id;
    }

    public void agregarPlato(Plato plato) {
        detalles.append(plato.toString()).append("\n");
        total += plato.precio;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + "\nDetalles:\n" + detalles + "Total: $" + total;
    }
}

// Clase Mesero: Asociación con Comensal
class Mesero {
    private String nombre;

    public Mesero(String nombre) {
        this.nombre = nombre;
    }

    public Pedido tomarPedido(Comensal comensal) {
        System.out.println(nombre + " toma el pedido de " + comensal.getNombre());
        return new Pedido("PED-" + System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Mesero: " + nombre;
    }
}

// Clase Comensal: Agregación con Pedido
class Comensal {
    private String nombre;

    public Comensal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void consumirPlato(Pedido pedido) {
        System.out.println(nombre + " está consumiendo el pedido:\n" + pedido);
    }

    @Override
    public String toString() {
        return "Comensal: " + nombre;
    }
}
