
package boletin12_2;

import javax.swing.JOptionPane;


public class Numeros {
    private int numero1;
    private int numero2 = (int)(Math. random()*50+1);;
    private int distancia;

    
    public void juegoNumeros (){
        while(numero1<1 || numero1<50){
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 Teclee el numero"));
            
            
            int distancia = Math.abs(numero1-numero2);
            
            
    if(distancia<50&&distancia>20){
                System.out.println("Moi lonxe");
    }
    
    else if (distancia>=10 && distancia<=20){
                System.out.println("Lonxe");
    }
    
    else if (distancia<10 && distancia>5){
                System.out.println("Preto");
    }
    
    else if(distancia<=5 && distancia>=1){ 
            System.out.println("Moi preto");
    }
    else if(distancia<=0){
        System.out.println("Es el mismo numero");
        break;
        
    }

    }
            
    }

}
 
