
package boletin11_1;

import javax.swing.JOptionPane;




public class Numeros {
    
    private int num;
    
        public void verNumero() {
        int num;
        int acPos=0;
        int acNeg=0;
        int acCer=0;
        for(int i=0;i<10;i++){
            num=pedirEntero();
            if(num>0)
            acPos++;
            else if (num<0)
            acNeg++;
            else
            acCer++;    
        }
            System.out.println("Los positivos son= "+acPos+ "\nLosnegativos son= "+acNeg+"\nLos cero son= "+acCer); 

    }
        public static int pedirEntero(){
        
        return Integer.parseInt(JOptionPane.showInputDialog("teclea numero entero"));
                }
}
