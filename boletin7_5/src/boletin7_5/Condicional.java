
package boletin7_5;


public class Condicional {
    
    private double num1;
    private double num2;
    private double num3;
    
    public void consultarNumeros(double num1, double num2, double num3) {
        
        if (num1>num2 & num1>num3)
            System.out.println("El numero 1 es el mayor");
        
        else if (num2>num1 & num2>num3)
            System.out.println("El numero 2 es el mayor");
        
        else 
            System.out.println("El numero 3 es el mayor");
    }

}
