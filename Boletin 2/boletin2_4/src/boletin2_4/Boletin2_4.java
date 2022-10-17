
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {


    public static void main(String[] args) {
        float num1, num2; 
        Scanner num = new Scanner(System.in);
        System.out.println("teclea el primer numreo");
        num1 = num.nextFloat();
        System.out.println("teclea el segundo numero");
        num2 = num.nextFloat();
        float suma = num1 + num2;
        float resta = num1 - num2;
        float producto = num1 * num2;
        float cociente = num1 / num2;
        System.out.println("Suma"+suma+ 
                "\n Resta"+resta+ 
                "\n Producto"+producto+
                "\n Cociente"+cociente);
      
    }
    
}
