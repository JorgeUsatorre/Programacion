
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

    public static final int CONV = 1852;
    
    public static void main(String[] args) {
       float millas, metros;
       Scanner obxScaner = new Scanner(System.in);
        System.out.println("Teclee las millas a convertir");
        millas = obxScaner.nextFloat();
        metros = millas * CONV;
        System.out.println("La conversion es de "+ metros + "metros");
                
    }
    
}
