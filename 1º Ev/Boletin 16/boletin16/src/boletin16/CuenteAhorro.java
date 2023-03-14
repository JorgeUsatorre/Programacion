
package boletin16;

import javax.swing.JOptionPane;


public class CuenteAhorro extends Cuenta{
    
    private double intereseVariable;
    
    private double sueldoMin;
    
   

    public CuenteAhorro(double intereseVariable, long numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.intereseVariable = intereseVariable;
        this.sueldoMin = sueldoMin;
        }
    
    public double cambioInteres(){
        return intereseVariable;
    }

    @Override
    public String toString() {
        return super.toString() + ", Interes variable=" + intereseVariable + ", Sueldo minimo=" + sueldoMin;
    }
        
    
}
