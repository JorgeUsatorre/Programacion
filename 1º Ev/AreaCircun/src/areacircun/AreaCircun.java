
package areacircun;

import java.util.Scanner;

public class AreaCircun {
    
    public static final double PI=3.14; 
    public static void main(String[] args) {
    
        Scanner obxScaner= new Scanner(System.in);
        float radio = obxScaner.nextFloat();
        double longitud = 2*PI*radio;
        float area = (float) (PI*Math.pow(radio, 2));
        System.out.println("longitud="+ longitud+
                "\narea ="+area);
    }
    
}
