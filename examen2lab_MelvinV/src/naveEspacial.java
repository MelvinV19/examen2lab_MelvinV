
import java.io.Serializable;


public abstract class naveEspacial implements Serializable {
    int numero;
    Planeta planeta;
    double velocidad;

    public naveEspacial() {
    }

    public naveEspacial(int numero, Planeta planeta, double velocidad) {
        this.numero = numero;
        this.planeta = planeta;
        this.velocidad = velocidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public abstract double[] calcularTiempo(double d,double v);
        
    
   
}
