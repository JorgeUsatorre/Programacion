
package boletin16;

import javax.swing.JOptionPane;


public class Cuenta {
    
    
private long numeroCuenta;
    private double saldo;
    private Persona cliente;
    
    public Cuenta() {
        
    }

    public Cuenta(long numeroCuenta, double saldo, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }


    
    public void Ingresar (String mensaxe){
        double ingreso = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
        this.saldo = this.saldo + ingreso;
        
    }
    
    public void Retiro (String mensaxe){
        double retiro = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
        if (saldo > 0) {
            this.saldo = this.saldo - retiro;
        }
        else {
            System.out.println("No se puede realizar retiro, no hay saldo");
        }
       
    }
    
    public double actualizarSaldo (){
        System.out.println("El saldo actual es de:");
        return this.saldo;
    }
    

    public long getNumeroConta() {
        return numeroCuenta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroCuenta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return  "Numero de cuenta= " + numeroCuenta + ", Saldo= " + saldo + ", Cliente= " + cliente ;
    }


    
    
    
    
    
    
    
}
