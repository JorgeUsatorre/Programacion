
package lectura;

import boletin27.Libros;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import pedirdatos.PedirDato;


public class LeerFichero {
    
    public ArrayList<Libros> crearArray(){
    ArrayList <Libros>lista = new ArrayList();
        return lista;
    }
   
    
    /*public ArrayList<Integer> buscarElemeto(File fichero, ArrayList<Libros> lista) throws FileNotFoundException {
        int atopado = 0; //No se encontro el elemento 
        float elebuscar = PedirDato.pedirFloat("Libro que quieres buscar ");
         
        
        Scanner sc = new Scanner(fichero);
        try {     
            
            
            for(int i=0; i<20; i++){
            if(elebuscar == Libros lista);
            System.out.println("Temperatura esta en la posicion "+(i+1));
            atopado = 1;
            break;
        }
        if(atopado==1);
        System.out.println("Temperatura encontrada ");
        
    
        }catch (IOException ex) {
            System.out.println("error 3 " + ex.getMessage());
        }
        finally {
            sc.close();
        }
        for (Integer ele:lista){
            System.out.println(ele);
     
        }
        return lista;
    } */
}
