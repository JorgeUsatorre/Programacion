
package boletin11_4;

import java.util.Scanner;


public class Boletin11_4 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int por=0;
        int opcion=1;
        while(opcion==1){
            System.out.println("Dame un numero");
            int n=scaner.nextInt();
            for (int i=1; i<11; i++){
                por=n*i;
                System.out.println(n+"+"+i+" = "+por);
            }
            System.out.println("Presiona el cero para salir y 1 para continuar");
            opcion=scaner.nextInt();
        }
    }
    
}
