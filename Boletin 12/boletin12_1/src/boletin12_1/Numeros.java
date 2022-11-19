
package boletin12_1;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Numeros {
    private int num1;
    private int num2;
    
    public void juegoNumeros(){
        
    while(num1<1 || num1<50){
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 Teclee el numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 Teclee el segundo numero"));
    
    if(num1>num2){
                System.out.println("El numero 2 es menor que el numero 1");
    }
    
    else if (num1<num2){
                System.out.println("El numero 2 es mayor que el numero 1");
    }
    
    else { 
            System.out.println("El numero 2 es el mismo que el numero 1");
                
        }
    }
    
    
        
}




    
    
    
}
