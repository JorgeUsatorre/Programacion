
package boletin12_2;

import javax.swing.JOptionPane;


public class Numeros {
    private int numero1;
    private int numero2 = (int)(Math. random()*50+1);;
    
    
    public void juegoNumeros (){
        while(numero1<1 || numero1<50){
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 Teclee el numero"));
            
    if(numero1>numero2){
                System.out.println("El numero 2 es menor que el numero 1");
    }
    
    else if (numero1<numero2){
                System.out.println("El numero 2 es mayor que el numero 1");
    }
    
    else { 
            System.out.println("El numero 2 es el mismo que el numero 1");
            break;
        }
    }
            
    }

}
 
