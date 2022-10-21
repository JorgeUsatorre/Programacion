
package boletin7_1;


public class CondicionalSimple {
    
    public void num(int num){
        if(num>=0)
            System.out.println("Es positivo");
        else
            System.out.println("Es negativo");
        
    }
    
    public void consultarnum(int num){
        String res = (num>=0)? "mayor":"menor";
        
        System.out.println("res");
    }
    
    
}
