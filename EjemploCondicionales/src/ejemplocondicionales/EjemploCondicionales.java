
package ejemplocondicionales;

import javax.swing.JOptionPane;


public class EjemploCondicionales {


    public static void main(String[] args) {
        
        //CondicionalSimple obx = new CondicionalSimple();
        // obx.mayorEdad();
        // obx.mayorEdad(89);
        
        //pedimos datos utilizando JOptionPane
        String res = JOptionPane.showInputDialog("Teclea la edad");
        int edad = Integer.parseInt(res);
        CondicionalDoble obx = new CondicionalDoble();
        obx.consultaredad(edad);
        obx.operarEdad(edad);
        int ed = Integer.parseInt( JOptionPane.showInputDialog("mensaje"));
        
       }
    
}
