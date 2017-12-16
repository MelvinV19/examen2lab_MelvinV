
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

    naveTripulada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public double[] calcularTiempo(double d, double v) {
       double []tiempo=new double[2];
       double peso=0;
        for (Astronauta a : lista) {
            peso+=a.getPeso();
        }
        double ida= d/ (v*(Math.pow(peso, 2)/100));
        double vuelta=d/(v*(peso/100));
        tiempo[0]=ida;
        tiempo[1]=vuelta;
       return tiempo;
    }
    
}
