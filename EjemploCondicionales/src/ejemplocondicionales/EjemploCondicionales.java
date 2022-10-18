
package ejemplocondicionales;

import javax.swing.JOptionPane;


public class EjemploCondicionales {


    public static void main(String[] args) {
        
        CondicionalSimple obx = new CondicionalSimple();
        
        obx.mayorEdad(89);
        
        //pedimos datos utilizando JOptionPane
        String res = JOptionPane.showInputDialog("Teclea la edad");
        System.out.println("res");
        
        
       }
    
}
