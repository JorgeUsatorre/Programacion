
package boletin7_4;

import java.util.Scanner;


public class Boletin7_4 {


    public static void main(String[] args) {
        double peso1;
        double peso2;
        
        Scanner obx = new Scanner(System.in);
        System.out.println("Teclee el primer peso");
        peso1 = obx.nextDouble();
        Scanner obx2 = new Scanner(System.in);
        System.out.println("Teclee el segundo peso");
        peso2 = obx2.nextDouble();
        
        Condicional obx4 = new Condicional();
        obx4.calcularDiferencia(peso1, peso2);

        Condicional obx5 = new Condicional();
        obx5.peso(peso1, peso2);
        
        
    }
    
}
