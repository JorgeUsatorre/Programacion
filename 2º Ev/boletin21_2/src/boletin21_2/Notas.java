 
package boletin21_2;


import java.util.Scanner;


public class Notas {
    
    Scanner sc = new Scanner(System.in);
    private int[] notas;
    private int aprobados;
    private int suspensos;
    private double media;
    private int max = 0;
    static int tam=10;
    

    
    public int[] crearArray(){
           int [] notas = new int [tam];
        
           for (int i = 0; i < notas.length; i++) {
           System.out.print("Nota delalumno " + (i+1) + ": ");
           notas[i] = sc.nextInt();
        }
           return notas;
    }


    public void calcularAprobadosSuspensos(int[] notas) {
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            
        }
            System.out.println("Nº de aprobados:" + aprobados);
            System.out.println("Nº de suspensos: " + suspensos);
        
    }

    public void calcularMedia(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        media = (double) suma / notas.length;
        System.out.println("La nota media es: " + media);
    }

    public void calcularNotaMaxima(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        System.out.println("La nota maxiama es: " + max);
    
    }

    
}
