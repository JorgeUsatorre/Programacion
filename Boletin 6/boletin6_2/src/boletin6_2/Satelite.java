
package boletin6_2;


public class Satelite {
    
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    public Satelite() {
        meridiano = paralelo = distanciaTierra = 0;
    }
    

    public Satelite (double meridiano, double paralelo, double distanciaTierra) {
    
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distanciaTierra = distanciaTierra;
                
    }
    
    public void verPosicion ( ) {

System.out.println (" o satelite atopase  no paralelo "+ paralelo + "meridiano " + meridiano +" a unha distancia da terra " + distanciaTierra );    


    } 
    
    
}
