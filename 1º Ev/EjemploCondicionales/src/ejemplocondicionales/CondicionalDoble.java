
package ejemplocondicionales;

public class CondicionalDoble {
    
        public void consultaredad(int edad) {
        if(edad>=18)
            
            System.out.println("Es mayor de edad");
        
        else 
            System.out.println("Es gay");
        
        }
        public void operarEdad(int edad){
        String res = (edad>=18)? "mayor":"menor";
        
        System.out.println("res");
        
        }
        
        
}
