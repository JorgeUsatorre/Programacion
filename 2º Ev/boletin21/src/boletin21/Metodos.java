package boletin21;

public class Metodos {
    
    private double numero;
    private int numero2 = (int)(Math. random()*50+1);
    
    
 public float[] numeros(){

        float [] numeros = new float [6];
        for(int i=0; i<numeros.length; i++){
            numeros[i]= numero2;           
        }       
        return numeros; 
    }
 
 public void mostrarArray(float[]numeros){
     
        for(int i=0; i<numeros.length; i++){
        System.out.println("Numeros "+i+" --> " + numeros[i]);     
        
        }      
    } 
 }
    
    
    

