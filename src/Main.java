/*
public class Main {
    public static void main(String[] args) {
        // Crear platos
        Plato plato1 = new Plato("Lasaña", 8.50);
        Plato plato2 = new Plato("Ensalada César", 5.20);
        Plato plato3 = new Plato("Pizza Margarita", 7.80);
        Plato plato4 = new Plato("Guata", 8.50);

        // Generar el menú automáticamente con los platos creados
        String menu = Plato.generarMenu();

        // Imprimir el menú
        System.out.println("\n--- Menú del Restaurante ---");
        System.out.println(menu);

        // Crear objetos iniciales
        Mesero mesero = new Mesero("Juan");
        Comensal comensal = new Comensal("Ana");

        // Crear un pedido y agregar platos
        Pedido pedido = mesero.tomarPedido(comensal);
        pedido.agregarPlato(plato1);
        pedido.agregarPlato(plato3);

        // Imprimir pedido completo
        System.out.println("\n--- Detalles del Pedido ---");
        System.out.println(pedido.detalles());

        // Comensal consume el plato
        comensal.consumirPlato(pedido);
    }
}

// Clase Plato: Representa un plato del menú
class Plato {
    private String nombre;
    public double precio;

    // Variable estática para almacenar los platos creados
    private static StringBuilder menuPlatos = new StringBuilder();

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

        // Agregar el plato al menú cada vez que se crea un nuevo plato
        agregarAlMenu(this);
    }

    // Método para agregar el plato al menú estático
    private static void agregarAlMenu(Plato plato) {
        if (menuPlatos.length() == 0) {
            menuPlatos.append("Menú del Día:\n");
        }
        int contador = menuPlatos.toString().split("\n").length;
        menuPlatos.append(contador)
                .append(". ")
                .append(plato.nombre)
                .append(" - $")
                .append(plato.precio)
                .append("\n");
    }

    // Método para generar el menú con los platos registrados
    public static String generarMenu() {
        return menuPlatos.toString();
    }

    // Obtener detalles del plato sin usar toString()
    public String obtenerDetalles() {
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
        detalles.append(plato.obtenerDetalles()).append("\n");
        total += plato.precio;
    }

    // Método para obtener los detalles del pedido sin usar toString()
    public String detalles() {
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

    // Obtener el nombre del mesero sin usar toString()
    public String obtenerNombre() {
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

    // Método para consumir el plato sin usar toString()
    public void consumirPlato(Pedido pedido) {
        System.out.println(nombre + " está consumiendo el pedido:\n" + pedido.detalles());
    }

    // Obtener el nombre del comensal sin usar toString()
    public String obtenerNombre() {
        return "Comensal: " + nombre;
    }
}
*/