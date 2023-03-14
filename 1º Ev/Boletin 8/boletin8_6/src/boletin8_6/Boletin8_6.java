
package boletin8_6;


public class Boletin8_6 {


    public static void main(String[] args) {
        
    System.out.println("Programa ventas");
    Almacen patatillas = new Almacen();
    patatillas.setNombre("Doritos");
    patatillas.setNumventas(60);
    Almacen zumo = new Almacen();
    zumo.setNombre("Zumo");
    zumo.setNumventas(50);

    Almacen Monster = new Almacen("Monster", 50000);

    Monster.tipoArticulo();





    }
}
        

