
package escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class EscribirFichero {
    
    FileWriter ou=null;
    PrintWriter fich=null;
    
        public void añadirRejistro(File fichero){
        try{   
            ou = new FileWriter (fichero,true);
            fich = new PrintWriter(ou);
            fich.println(JOptionPane.showInputDialog("Libro"));

        }catch (IOException ex){
            System.out.println("error de escritura" + ex.getMessage());
        }
        finally{
            fich.close();
        }
           
    }
    
}
