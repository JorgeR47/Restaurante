package restaurante;
public class Comensal {

    private String nombre ;

    public Comensal (String nombre){

        this.nombre = nombre;
    }
    public String getNombre(){

        return nombre;
    }
    
    @Override
    public String toString(){

        return "Comensal: "+ nombre;
    }

}
/*
import java.io.PipedInputStream;

public class Comensal {
    private int idComensal;
    private String nombre;
    private Pedido pedido;

}

 */