
package ejemplocondicionales2;

import javax.swing.JOptionPane;


public class EjemploCondicionales2 {


    public static void main(String[] args) {
        //CondicionalSimple obx = new CondicionalSimple();
        // obx.mayorEdad();
        // obx.mayorEdad(89);
        
        //pedimos datos utilizando JOptionPane
        //String res = JOptionPane.showInputDialog("Teclea la edad");
        //int edad = Integer.parseInt(res);
        //CondicionalDoble obx = new CondicionalDoble();
        //obx.consultaredad(edad);
        //obx.operarEdad(edad);
        //int ed = Integer.parseInt( JOptionPane.showInputDialog("Edad"));
        
        // llamo al condicional multiple
        CondicionalesMultiples obx = new CondicionalesMultiples();
        //obx.consultarEdad(ed);
            int dia = pedirInt("Numero del día");
            obx.consultarDiaSwutch(dia);
        
    }
    
    public static int pedirInt (String mensaje) {
       return  Integer.parseInt( JOptionPane.showInputDialog(mensaje));
        
    }
    
    public void ver() {
        pedirInt("dame valor");
        
    }
}
