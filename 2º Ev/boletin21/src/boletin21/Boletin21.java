package boletin21;

import java.util.Random;

public class Boletin21 {

    public static void main(String[] args) {
        
        
       /* Metodos obx = new Metodos();
        float[] numeros = obx.numeros();
        obx.mostrarArray(numeros); */
       
       
       /*
        int[] numeros = new int[6];
        Random rand = new Random();

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(50) + 1;
        }


        System.out.print("Array ");
        for (int num : numeros) {
            System.out.print(num);
        } */
    
    
       

  
        Random obx = new Random();
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = obx.nextInt(50) + 1;
            System.out.println(numeros[i]);
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}

       



        
        

