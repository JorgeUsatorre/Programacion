
package ejemplobucles;

import javax.swing.JOptionPane;


public class BucleWhile {

    public void verNumero() {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Teclee un numeo positivo"));
        while(num>=0) {
            System.out.println(num);
        num = Integer.parseInt(JOptionPane.showInputDialog("Teclee un numeo positivo"));
            
        }
        System.out.println("Salimos del bucle");
        
        
        
    }
}
