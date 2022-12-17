
package boletin13;

import boletin13.paquete2.Personal;


public class Boletin13 {


    public static void main(String[] args) {
        
        Personal obxp = new Personal("555454545","asdsdads@gmail.com");      
        Academia obx = new Academia(2,2018);
                
        System.out.println(obx.toString());
        System.out.println(obxp.toString());
        
    }
    
}
