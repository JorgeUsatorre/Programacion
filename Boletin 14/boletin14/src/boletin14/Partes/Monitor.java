
package boletin14.Partes;

public class Monitor {
    
    private float pulgadas;
    
    
    
    //Constructor sin parametrizar.
    public Monitor(){
        
    }
    
    //Constructor parametrizado.
    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    //Metodos getters, setters y toString.
    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Pulgadas del monitor= " + pulgadas ;
    }
    
    
}
