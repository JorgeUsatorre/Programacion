
package boletin15;

import javax.swing.JOptionPane;


public class Boletin15 {


    public static void main(String[] args) {
        
        Multimedia obx1 = new Multimedia("LOST","Jose Antonio","asddsa","2 horas");    

        Pelicula obx2 = new Pelicula("Pedro","Rosa", "Los trece","Juan Antonio Perez","16:9","3 horas");
        
        Disco obx3 = new Disco("pop‎","Only The Strong Survive","Bruce Springsteen","mp3","1 Hora");
                
        
        System.out.println("Multimedia: " + obx1.toString() + "\nPelicula: " + obx2.toString() + "\nDisco: " + obx3.toString());
        
    }
    
}
