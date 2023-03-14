package boletin24.metodos;

import java.util.ArrayList;
import java.util.Iterator;
import pedirdatos.PedirDato;

public class Metodos extends Libros{
    
    Libros li = new Libros();
   
        public ArrayList<Libros> añadir(ArrayList<Libros>lista){
            
        lista.add(new Libros(PedirDato.pedirString("Titulo: "),PedirDato.pedirString("autor: "),PedirDato.pedirString("ISBN: "),PedirDato.pedirFloat("Precio: "),PedirDato.pedirint("Numero de unidades: ")));  
            
        return lista;
    }
    
        public void eliminar(ArrayList<Libros>lista){
               
        String nomBuscar=PedirDato.pedirString("Que libro quieres borrar");
        Iterator it=lista.iterator(); 
        while(it.hasNext())
        li=(Libros)it.next();
        if(li.getTitulo().equalsIgnoreCase(nomBuscar))
            it.remove();

    }
 
        public void amosar(ArrayList<Libros>lista){

        Iterator it = lista.iterator();
        while(it.hasNext()){   
            System.out.println(it.next());  
        }
        
    }
        
        public void elimNum(ArrayList<Libros>lista){     
        Iterator it=lista.iterator(); 
        while(it.hasNext())
        li=(Libros)it.next();
        if(li.getnUnidades()==0);
            it.remove();
         
    }
        
        public void consultarLibro(ArrayList<Libros>lista){
            
            String buscarLibro = PedirDato.pedirString("Que libro quieres buscar");
            Iterator it=lista.iterator(); 
            while(it.hasNext())
            li=(Libros)it.next();
            if(li.getTitulo().equalsIgnoreCase(buscarLibro));
            System.out.println("asd");

        }
}
