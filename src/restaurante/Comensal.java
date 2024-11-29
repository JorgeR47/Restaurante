package restaurante;
public class Comensal {
    private String nombre;
    private String cedula;

    public Comensal(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void setNombreComensal(String nombre) {
        this.nombre = nombre;
    }

    public void setCedulaComensal(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreComensal() {
        return nombre;
    }

    public String getCedulaComensal() {
        return cedula;
    }

    public void realizarPedido() {
        System.out.println("Pedido realizado por: " + nombre);
    }

    public void cancelarPedido() {
        System.out.println("Pedido cancelado por: " + nombre);
    }
}

