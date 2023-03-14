
package boletin22;
import pedirdatos.PedirDato;
/**
 *
 * @author Jorge
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int num;
        
        Metodos obx = new Metodos();
        int [][]auxGoles = null;
        int []auxJornadas;
        auxGoles = obx.crearArrayGoles();
        auxJornadas = obx.crearJornadas();
        do{
            num = PedirDato.pedirint("1. Mostrar tabla\n2. Ordenar por goles máximos\n3. Indica el equipo que mas goles marca cada jornada\n4. Indica que equipo y en que jornada se registran mas goles\n5. Consulta por equipos y jornadas indicando el numero de goles\n6. Salir");
            switch(num){
                case 1:
                    obx.verTabla(auxJornadas, obx.equipos, auxGoles);
                    break;
                case 2:
                    obx.ordenarTabla(obx.equipos, auxGoles);
                    break;
                case 3:
                    obx.verMaximoGoleadorXornada(obx.equipos, auxJornadas, auxGoles);
                    break;
                case 4:
                    obx.verEquipoMaxGolesPorXornada(obx.equipos, auxJornadas, auxGoles);
                    break;
                case 5:
                    obx.verEquipoXornadaPorGoles(obx.equipos, auxJornadas, auxGoles);
                    break;
                case 6:System.exit(num);
                break;
            }
        }while(num>0);
    }
    

    
}
