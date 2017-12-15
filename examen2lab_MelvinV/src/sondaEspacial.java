
import java.io.Serializable;


public class sondaEspacial extends naveEspacial implements Serializable{
   String material;
   double peso;

    public sondaEspacial(String material, double peso) {
        this.material = material;
        this.peso = peso;
    }

    public sondaEspacial(String material, double peso, int numero, Planeta planeta, double velocidad) {
        super(numero, planeta, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
}
