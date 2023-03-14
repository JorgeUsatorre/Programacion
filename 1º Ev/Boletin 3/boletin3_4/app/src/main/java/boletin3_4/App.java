
package boletin3_4;

import java.util.Scanner;

public class App {
    
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int billetes100, billetes20, billetes5, monedas1;
        Scanner dinero = new Scanner(System.in);
        System.out.println("Teclee la cantidad total de euros");
        int eurosTotales = dinero.nextInt();
        
        int div1 = eurosTotales/100;
        int r_cien = eurosTotales%100;
        
        int div2 = r_cien/20;
        int r_veinte = r_cien%20;
        
        int div3 = r_veinte/5;
        int r_cinco = r_veinte%5;
        
        billetes100 = div1;
        billetes20 = div2;
        billetes5 = div3;
        monedas1 = r_cinco;
        
        System.out.println("La cantidad de billetes y/o monedas es:" +
                "\n Billetes de 100: "+billetes100+
                "\n Billetes de 20: "+billetes20+
                "\n Billetes de 5: "+billetes5+
                "\n Monedas de 1: "+monedas1);
        
       
    }
}
