package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {
    
    public static void main(String[] args) {
        
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        JOptionPane.showMessageDialog(null, "Conversor de temperatura");
        try {
            float centigrados = 95;
            System.out.println(centigrados + "ºC = " + conversor.centigradosAFharenheit(centigrados) + "ºF");
            System.out.println(centigrados + "ºC = " + conversor.centigradosAReamur(centigrados) + "ºR");
        } catch (TemperaturaErradaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}