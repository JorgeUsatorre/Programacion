
package boletin11_3;

import javax.swing.JOptionPane;


public class Boletin11_3 {


    public static void main(String[] args) {
        double base=0;
        double altura=0;
        
        do {
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base" ));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura"));
            double area =(base*altura)/2;
            if (base > 0 && altura > 0) {
                System.out.println("El area es "+area);
                break;
        }
            else if (base<3 && altura<3);
            System.out.println("Introduzacca un numero positivo");
            
        }
        while (base !=0 && altura !=0);
    }
    
}
