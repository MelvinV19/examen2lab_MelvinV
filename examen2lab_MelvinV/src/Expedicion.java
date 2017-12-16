
import javax.swing.JOptionPane;


public class Expedicion extends Thread{
    naveEspacial nave;
    Planeta planeta;
    boolean vive;
    boolean avanzar;
    double ida;
    double vuelta;
    public Expedicion() {
        
    }

    public Expedicion(naveEspacial nave, Planeta planeta, boolean vive, boolean avanzar, double ida, double vuelta) {
        this.nave = nave;
        this.planeta = planeta;
        this.vive = true;
        this.avanzar = true;
        double []tiempo=nave.calcularTiempo(nave.getPlaneta().distancia, nave.getVelocidad());
        this.ida = tiempo[0]*1000;
        this.vuelta = tiempo[1];
    }

    
    
    public naveEspacial getNave() {
        return nave;
    }

    public void setNave(naveEspacial nave) {
        this.nave = nave;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public double getIda() {
        return ida;
    }

    public void setIda(double ida) {
        this.ida = ida;
    }

    public double getVuelta() {
        return vuelta;
    }

    public void setVuelta(double vuelta) {
        this.vuelta = vuelta;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                if(ida>=0){
                    ida--;
                }else{
                    vuelta--;
                }
                if(ida<=0){
                    JOptionPane.showMessageDialog(null,"Esta nave llego al planeta");
                }
                if(vuelta<=0){
                    JOptionPane.showMessageDialog(null,"La nave ha vuelto a la tierra");
                }
            }
        }
    }
}
