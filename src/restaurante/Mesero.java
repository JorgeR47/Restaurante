package restaurante;
public class Mesero {
    private String nombre;

    public Mesero (String nombre){

        this.nombre = nombre;
    }

    public String getNombre(){

        return nombre;
    }

    @Override
    public String toString(){

        return "Mesero: " + nombre;
    }

}
