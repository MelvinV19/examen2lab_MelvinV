
import java.io.Serializable;
import java.util.ArrayList;


public class naveTripulada extends naveEspacial implements Serializable{
    String lugar;
    ArrayList <Astronauta >lista=new ArrayList();

    public naveTripulada(String lugar) {
        this.lugar = lugar;
    }

    public naveTripulada(String lugar, int numero, Planeta planeta, double velocidad) {
        super(numero, planeta, velocidad);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Astronauta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Astronauta> lista) {
        this.lista = lista;
    }
    
}
