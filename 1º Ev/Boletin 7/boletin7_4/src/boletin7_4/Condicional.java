
package boletin7_4;


public class Condicional {
    
    private double diferencia;
    
    
    public void peso(double peso1, double peso2) {
        if (peso1<peso2)
            System.out.println("Pesa mas la persona 2");
            
        else
            System.out.println("Pesa mas la persona 1  ");
    }
    
        
            public void calcularDiferencia(double peso1, double peso2) {

        diferencia = Math.abs(peso1-peso2);
        
        System.out.println("La diferencia es de: "+diferencia);
      
    }
        
    
    

    
}

