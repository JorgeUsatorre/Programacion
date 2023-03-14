
package boletin14;


import boletin14.Partes.CPU;
import boletin14.Partes.Monitor;
import boletin14.Partes.Teclado;

public class Boletin14 {


    public static void main(String[] args) {
        
        Monitor obxm = new Monitor(27);
        Teclado obxt = new Teclado("hp");
        CPU obxc = new CPU(86);
        Ordenador obxo = new Ordenador(obxm, obxt, obxc,399);
        

        System.out.println( obxo.toString() );
        System.out.println("Precio del ordenador : "  + obxo.getPrecio());
        System.out.println( obxt.toString());
        System.out.println( obxc.toString());
        
    }
}
