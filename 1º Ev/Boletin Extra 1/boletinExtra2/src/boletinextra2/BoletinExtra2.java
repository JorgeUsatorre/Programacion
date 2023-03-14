
package boletinextra2;

import java.util.Scanner;


public class BoletinExtra2 {


    public static void main(String[] args) {
        double a, b, c, x, y;
        
        
        
        Scanner obxScaner = new Scanner(System.in);
        System.out.println("Teclee el valor de a");
        a = obxScaner.nextDouble();
        System.out.println("Teclee el valor de b");
        b = obxScaner.nextDouble();
        System.out.println("Teclee el valor de c");
        c = obxScaner.nextDouble();
        System.out.println("Teclee el valor de x");
        x = obxScaner.nextDouble();
        System.out.println("el valor de Y es: "+ (a * Math.pow(x, 2)+b*x+c));
        
        
    }
    
}
