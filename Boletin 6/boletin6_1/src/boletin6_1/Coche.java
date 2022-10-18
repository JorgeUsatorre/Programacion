
package boletin6_1;


public class Coche {
    private int velocidade; 
    private int acelerar;
    private int frenar;
    
    
    
    public Coche() {
        
    }
   
    public Coche(int velocidad, int acelerar, int frenar) {
        velocidade=0;
        this.acelerar=acelerar;
        this.frenar=frenar;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void acelerar(int valor) {
        velocidade=velocidade+valor;
        
        
    }
    
    public void frenar (int menos) {
        velocidade=velocidade-menos;
    }
    
}
