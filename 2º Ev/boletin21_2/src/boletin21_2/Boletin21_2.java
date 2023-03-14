package boletin21_2;

public class Boletin21_2 {

    public static void main(String[] args) {
        
        Notas obx = new Notas();
        int [] aux ;
        
        aux = obx.crearArray();
        obx.calcularAprobadosSuspensos(aux);
        obx.calcularMedia(aux);
        obx.calcularNotaMaxima(aux);

    }
}



