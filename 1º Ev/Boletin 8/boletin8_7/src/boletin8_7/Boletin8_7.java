
package boletin8_7;

import java.util.Scanner;


public class Boletin8_7 {


    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Metodo rectangulo = new Metodo();


    Metodo triangulo = new Metodo();


    Metodo circulo = new Metodo();

        System.out.println("Que ejercicio quieres ver");
        int ej = sc.nextInt();
        
        switch (ej){
        case 1:
            double area = rectangulo.calcularAreaR(3,6);
            System.out.println(area);
            break;
        case 2:
            System.out.println(triangulo.calcularAreaTr(3,6));
                    break;
        case 3:
            System.out.println(circulo.calcularAreaC(3));
            break;
        default:
            System.out.println("No hay ejercicio "+ej);
            break;

        }
    }
}
