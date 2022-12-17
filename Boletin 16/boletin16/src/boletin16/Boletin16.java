
package boletin16;


public class Boletin16 {


    public static void main(String[] args) {
        
        Persona obxCliente = new Persona("Pedro", "asdasd", "asdasd3");
        String datosCliente = obxCliente.toString();
        System.out.println("Cliente: " + datosCliente);
        
        CuentaCorriente obxCuentaCorriente = new CuentaCorriente(8745, 52665, obxCliente);
        String datosCuentaCorriente = obxCuentaCorriente.toString();
        System.out.println("Cuenta Corriente: " + datosCuentaCorriente);
        
        CuenteAhorro obxCuentaAhorro = new CuenteAhorro(25, 8745, 52665, obxCliente);
        String datosCuentaAhorro = obxCuentaAhorro.toString();
        System.out.println("Cuenta Ahorro: " + datosCuentaAhorro);
        
        
        
        
    }
    
}