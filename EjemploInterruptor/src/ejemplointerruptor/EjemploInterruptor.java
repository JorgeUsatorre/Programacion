
package ejemplointerruptor;


public class EjemploInterruptor {


    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int par = 0;
        int impar = 0;
        while (i<5) {
            if (i==0){
                par = par + i;
                j = 1;
                System.out.println("Par"+par);
            }
            if (j==0){
                impar = impar + 1;
                j = 0;
                System.out.println("Impar"+impar);
            }
        
    }
        
        
    }
    
}
