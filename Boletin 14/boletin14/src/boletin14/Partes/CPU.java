
package boletin14.Partes;


public class CPU {
    private int velocidad;

    public CPU(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Velocidad CPU= " + velocidad ;
    }

    
    
    
    
}
