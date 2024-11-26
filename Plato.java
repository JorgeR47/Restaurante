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
