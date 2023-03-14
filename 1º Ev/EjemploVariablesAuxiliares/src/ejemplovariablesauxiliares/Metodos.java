
package ejemplovariablesauxiliares;


public class Metodos {
    

    
    public void calcularParesImpares() {
        int i=1, acPar=0, acImpar=1, sw=0;
        
        while(i<=10){
            if(sw!=0) {
                acPar = acPar+i;
                sw=0;
                
            }
            else {
                acImpar = acImpar*i;
                sw=1;
            }
            i++;
        }
        System.out.println("Suma de pares = "+acPar +"\nProducto de impares = "+acImpar);
        
       
        
        
        
        
    
}
    
}
