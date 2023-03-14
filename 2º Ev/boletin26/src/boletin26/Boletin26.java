package boletin26;

public class Boletin26 {
    
    public static void main(String[] args) {
        
        Integer[] lista = {1, 3, 5, 7, 9};
        Operacions<Integer> obx = new Operacions<>();
        Integer minimo = obx.calcularMinimo(lista);
        Integer maximo = obx.calcularMaximo(lista);
        int posicion = obx.buscarObjeto(lista, 5);
        System.out.println("Minimo: " + minimo);
        System.out.println("Maximo: " + maximo);
        System.out.println("Posicion de 5: " + posicion);
    }
}

        
