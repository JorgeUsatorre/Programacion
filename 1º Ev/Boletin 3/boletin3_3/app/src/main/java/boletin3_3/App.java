
package boletin3_3;

import java.util.Scanner;

public class App {
    
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        float billetes100, billetes20, billetes5, monedas1;
        Scanner dinero = new Scanner(System.in);
        System.out.println("Teclee los billetes de 100€");
        billetes100 = dinero.nextFloat();
        System.out.println("Teclee los billetes de 20€");
        billetes20 = dinero.nextFloat();
        System.out.println("Teclee los billetes de 5€");
        billetes5 = dinero.nextFloat();
        System.out.println("Teclee las monedas de 1€");
        monedas1 = dinero.nextFloat();
        float eurosTotales = billetes100 * 100 + billetes20 *20 + billetes5 * 5 + monedas1;
        System.out.println("La cantidad de euros totales es de "+ eurosTotales+"€");
                }
}
