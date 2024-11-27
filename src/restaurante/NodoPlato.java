package restaurante;

public class NodoPlato {
    Plato plato;
    int cantidad;
    NodoPlato siguiente;

    public NodoPlato(Plato plato, int cantidad) {
        this.plato = plato;
        this.cantidad = cantidad;
        this.siguiente = null;
    }
}
