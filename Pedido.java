
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Comensal comensal;
    private Mesero mesero;
    private List<Plato> platos;

    public Pedido (Comensal comensal, Mesero mesero){

        this.comensal = comensal;
        this.mesero = mesero;
        this.platos = new ArrayList<>();
    }
    public void agregarPlato (Plato plato){
        platos.add(plato);
    }

    public void imprimirPedido(){

        System.out.println(comensal);
        System.out.println(mesero);
        System.out.println("Lo que pidio es: ");
        for (Plato plato : platos){
            System.out.println(plato);
        }
    }


}
