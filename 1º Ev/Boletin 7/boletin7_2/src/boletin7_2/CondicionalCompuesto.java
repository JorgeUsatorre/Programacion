
package boletin7_2;


public class CondicionalCompuesto {
    private short num1;
    private short num2;


    public void consultarNumero(short num1, short num2) {
        if (num1>=num2)
            System.out.println("Num 1 es mayor o igual que el num 2"+ "\nLa resta de estos es: "+(num1-num2)+"\nY la suma es: "+(num1+num2));
        
        else
            System.out.println("Num 2 es mayor que el num 1" +"\nLa suma de estos es: "+(num1+num2));
    }
    
}
