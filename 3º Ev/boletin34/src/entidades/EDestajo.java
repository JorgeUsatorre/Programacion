/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author Jorge
 */
public class EDestajo extends Empregado{
    private int numeroClientesCaptados;
    private float complementoClienteCaptado;
    
    public EDestajo(String DNI, String nome, String apelidos, GregorianCalendar e, int clientesCaptados, float complemento) {
        super(DNI, nome, apelidos, e);
        this.numeroClientesCaptados = clientesCaptados;
        this.complementoClienteCaptado = complemento;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numeroClientesCaptados + ", " + complementoClienteCaptado;
    }
    
}
