
package boletin6_1;


public class Boletin6_1 {


    public static void main(String[] args) {
        
        Coche obxCoche = new Coche();
        obxCoche.acelerar(30);
        System.out.println("Aceleracion de: "+obxCoche.getVelocidade());
        
        obxCoche.frenar(5);
        System.out.println("deceleracion de "+ obxCoche.getVelocidade() );
        
    }
    
}
