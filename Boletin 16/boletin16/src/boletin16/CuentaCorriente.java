
package boletin16;


public class CuentaCorriente extends Cuenta{
    
    private final double INTERES_FIXO = 1.5; 

    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        super.setSaldo(saldo * INTERES_FIXO);
    }

    @Override
    public String toString() {
        return super.toString() + ", Interes fijo=" + INTERES_FIXO ;
    }
    
    

    

}
