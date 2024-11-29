package restaurante;

public class Plato {
    private String nombre;
    private double precio;
    private boolean disponible;
    private static StringBuilder menuPlatos = new StringBuilder();
    private static int platosDisponibles = 0;

    public Plato(String nombre, double precio, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
        agregarAlMenu(this);
    }
    // Método para agregar el plato al menú estático
    private static void agregarAlMenu(Plato plato) {
        if (plato.disponible) {
            platosDisponibles++;
            menuPlatos.append(platosDisponibles)
                    .append(". ")
                    .append(plato.nombre)
                    .append(" - $")
                    .append(String.format("%.2f", plato.precio))
                    .append("\n");
        }
    }
    public static String generarMenu() {
        if (platosDisponibles == 0) {
            return "Sin platos disponibles\n";
        }
        return menuPlatos.toString();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean estaDisponible() {
        return disponible;
    }

}
