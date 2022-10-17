
package boletin3_5;

import java.util.Scanner;

public class App {
    
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        double sueldoFijo, importeVentas, numKm, numDias, sueldoBruto, sueldoLiquido;
        Scanner obxScaner = new Scanner(System.in);
        System.out.println("Teclee el sueldo fijo");
        sueldoFijo = obxScaner.nextDouble();
        System.out.println("Teclee el importe de ventas");
        importeVentas = obxScaner.nextDouble();
        System.out.println("Tevlee el numero de kilometros");
        numKm = obxScaner.nextDouble();
        System.out.println("Teclee el numero de dias");
        numDias = obxScaner.nextDouble();
        
        sueldoBruto = sueldoFijo + (0.05*importeVentas) + (2*numKm) + (30*numDias);
        
        sueldoLiquido = sueldoBruto - ((0.018*sueldoBruto) + 36);
        
        System.out.println("El sueldo bruto es: "+ sueldoBruto + "y el sueldo liquido es de: "+ sueldoLiquido);
    }
}
