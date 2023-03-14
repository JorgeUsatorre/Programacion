
package boletin2_1;

import java.util.Scanner;


public class Boletin2_1 {


    public static void main(String[] args) {
    float base , altura; //Variables locales;
    Scanner obxScaner = new Scanner(System.in);
    System.out.println("teclea la base");
    base=obxScaner.nextFloat();
    System.out.println("teclea la altura");
    altura = obxScaner.nextFloat();
    float area = base*altura;
    System.out.println("el area ="+area);
    
    }
    
}
