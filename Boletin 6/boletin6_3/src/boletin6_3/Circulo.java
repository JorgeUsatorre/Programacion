
package boletin6_3;


public class Circulo {
    private double radio;
    public static final double PI = 3.14;
    
    
    public Circulo() {
        
    }
    
    public Circulo(double radio) {
        this.radio=radio;
    }
    
    public void setradio(double radio) {
        this.radio=radio;
    }
    
    public double getradio() {
        return radio;
    }
    
    
    public void calcularArea() {
        
        System.out.println("El area de la circunferencia es: " + PI * Math.pow(radio, 2));
    }
    
    public void calcularLongitud() {
        System.out.println("La lomgitud de la circunferencia es: " + 2 * PI * radio );
    }
    
}
