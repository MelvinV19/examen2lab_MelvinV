
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

    
    
}
