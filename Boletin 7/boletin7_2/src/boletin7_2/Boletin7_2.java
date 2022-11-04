
package boletin7_2;

import java.util.Scanner;

public class Boletin7_2 {


    public static void main(String[] args) {
        
        short num1;
        short num2;
        
        Scanner obx1 = new Scanner(System.in);
        System.out.println("Teclee el primer numero");
        num1 = obx1.nextShort();
        Scanner obx2 = new Scanner(System.in);
        System.out.println("Teclee el segundo numero");
        num2 = obx2.nextShort();
        
        CondicionalCompuesto obx = new CondicionalCompuesto();
        obx.consultarNumero(num1, num2);
    }
    
}
