
package ejemplocondicionales;

public class CondicionalMultiple {
    
    public void consultarEdad(int edad) {
        if(edad >18)
            
            System.out.println("Es mayor de edad");
        
        else if (edad < 18)
            System.out.println("Es menor de edad");
        
        else   
                System.out.println("Tiene 18 años");
    
    }
    
}
