
package com.mycompany.arearectangulo;

import java.util.Scanner;


public class AreaRectangulo {

    public static void main(String[] args) {
        float base, altura, area;
        Scanner obxScaner = new Scanner (System.in);
        System.out.println("Teclea la base");
        base= obxScaner.nextFloat();
        System.out.println("Teclea la altura");
        altura=obxScaner.nextFloat();
        area=(base*altura)/2;
        System.out.println("El area es:"+area);
        
                
    }
}
