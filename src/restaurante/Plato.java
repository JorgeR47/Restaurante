package restaurante;
public class Plato {

    private String nombre;
    private double precio;
    
    public Plato (String nombre, double precio){

        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Plato: " + nombre + ", Precio: " + precio;
    }

}
/*

public class Plato {
    private int idPlato;
    private String nombre;
    private double precio;
    private String descripcion;
    private boolean disponible;

    // constructor
    public Plato(int idPlato, String nombre, double precio, String descripcion, boolean disponible) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }

    // Métodos Getters y Setters
    public int getIdPlato() {
        return idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getDisponible() {
        return disponible;
    }
    // funcion de modificar el estado del plato.
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // mostrar informacion del plato
    public void mostrarInformacionPlato() {
        System.out.println("Plato ID: " + idPlato);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

}

 */
