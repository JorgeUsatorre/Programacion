/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author usato
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float base , altura; //Variables locales;
    Scanner obxScaner = new Scanner(System.in);
    System.out.println("teclea la base");
    base=obxScaner.nextFloat();
    System.out.println("teclea la altura");
    altura = obxScaner.nextFloat();
    float area = base*altura;
    System.out.println("el area ="+area);
    
    }
    
}
