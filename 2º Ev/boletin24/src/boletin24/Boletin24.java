package boletin24;

import boletin24.metodos.Libros;
import boletin24.metodos.Metodos;
import java.util.ArrayList;
import pedirdatos.PedirDato;


public class Boletin24 {

    public static void main(String[] args) {
        
        ArrayList<Libros>listaLib = new ArrayList<>();
        Metodos obx = new Metodos();
        int ca;
  
        do{      
        ca = PedirDato.pedirint("------Menu------\n 1-->Añadir libro\n 2-->Eliminar libro\n 3-->Mostrar\n 4-->Borrar por nº unidades\n 5-->Consultar un libro\n\nTeclea una opcion");   
       
        switch(ca){
            case 1:obx.añadir(listaLib);
            break;
            case 2:obx.eliminar(listaLib);
            break;
            case 3:obx.amosar(listaLib);
            break;
            case 4:obx.elimNum(listaLib);
            break;
            case 5:obx.consultarLibro(listaLib);
            break;
            default:System.out.println("Opcion incorrecta");
            
        } 
        }while(ca>=1&&ca<=5); 
    }
}
