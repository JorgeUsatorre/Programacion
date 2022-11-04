
package boletin7_5;

import java.util.Scanner;


public class Boletin7_5 {


    public static void main(String[] args) {
        
        double num1;
        double num2;
        double num3;
       
        Scanner obx = new Scanner(System.in);
        System.out.println("Teclee el primer numero");
        num1=obx.nextDouble();
        Scanner obx2 = new Scanner(System.in);
        System.out.println("Teclee el segundo numero");
        num2 = obx2.nextDouble();
        Scanner obx3 = new Scanner(System.in);
        System.out.println("Teclee el tercer numero");
        num3 = obx3.nextDouble();
        
        Condicional obx5 = new Condicional();
        obx5.consultarNumeros(num1, num2, num3);
        
    }
    
}
