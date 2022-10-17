
package boletin3_1;

import java.util.Scanner;

public class App {
    
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        float precioInicial, precioFinal;
        Scanner precio = new Scanner(System.in);
        System.out.println("Teclee el precio inicial");
        precioInicial = precio.nextFloat();
        System.out.println("Teclee el precio final");
        precioFinal = precio.nextFloat();
        float descuento = 100-(precioFinal*100/precioInicial);
        System.out.println("Descuento final:"+ descuento+ "%");
    }
}
