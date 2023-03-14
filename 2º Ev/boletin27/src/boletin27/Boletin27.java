
package boletin27;

import escritura.EscribirFichero;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import lectura.LeerFichero;


public class Boletin27 {

  
    public static void main(String[] args) throws FileNotFoundException {
        
        File obxf = new File("libros.txt");
        EscribirFichero obx = new EscribirFichero();
        LeerFichero obxl = new LeerFichero();
        int opcion;
        
        do{
        
         opcion = Integer.parseInt(JOptionPane.showInputDialog("---MENU---\n1-->AÑADIR NUEVO LIBRO \n2-->"));
        
        switch(opcion){
            case 1: obx.añadirRejistro(obxf);
            break;
            case 2: //obxl.buscarElemeto(obxf);
            break;
            case 7: System.exit(opcion);
            default: System.out.println("Opcion incorrecta ");
        }
        
        }while(opcion<=7);
        
    }
    
}
