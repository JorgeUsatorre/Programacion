
package boletin7_3;

import javax.swing.JOptionPane;


public class Boletin7_3 {


    public static void main(String[] args) {
        
        Condicional obx = new Condicional();
        //obx.consultarEdad(ed);
            int num = pedirInt("Teclee un numero");
            obx.num(num);
        
    }
    
    public static int pedirInt (String mensaje) {
       return  Integer.parseInt( JOptionPane.showInputDialog(mensaje));
        
    }
   
}
