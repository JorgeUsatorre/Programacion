
package boletin3_2;

import java.util.Scanner;

public class App {
    
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        double gradosCentigrados;
        Scanner grados = new Scanner(System.in);
        System.out.println("Teclee los grados centigrados");
        gradosCentigrados = grados.nextDouble();
        double gradosFaheranheit = gradosCentigrados * 1.8 + 32;
        double gradosKelvin = gradosCentigrados + 273.15;
        System.out.println("Grados Faheranheit:"+ gradosFaheranheit +
                "\n Grados Kelvin:"+ gradosKelvin);
    }
}
