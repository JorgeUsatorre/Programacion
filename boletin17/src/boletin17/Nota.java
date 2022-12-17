
package boletin17;

import javax.swing.JOptionPane;


public class Nota {
    
    private float exTeo1;
    private float exTeo2;
    private float exPrac;
    private int numBoletines;
    private int nota;
    private String sigo;
    private final static int BOLETINES=15;

    
    public void Operacions(){
        
        while(!"no".equalsIgnoreCase(sigo)){
        exTeo1= pedirNotas();
        exTeo2= pedirNotas();
        exPrac= pedirNotas();
        numBoletines=(int) pedirNotas();
        float PruebasEscritas=((exTeo1+exTeo2)/2)*(float)0.4;
        float PruebasPractica= exPrac*(float)0.4;
        
        float boletin= (float)numBoletines/BOLETINES;
        if(boletin>0.9)
            nota=2;
        else if(boletin>=0.70 && boletin<=0.9)
            nota=1;
        else if(boletin<0.70)
            nota=0;
        
        float totalNota= PruebasEscritas+PruebasPractica+nota;
        JOptionPane.showMessageDialog(null, "La nota final es=" + totalNota);
        sigo=JOptionPane.showInputDialog("¿Quieres continuar calculando otras notas?");
        }
    }
    
    
    public Nota() {
    }

    public Nota(float exTeo1, float exTeo2, float exPrac, int numBoletines) {
        this.exTeo1 = exTeo1;
        this.exTeo2 = exTeo2;
        this.exPrac = exPrac;
        this.numBoletines = numBoletines;
    }
    
    public static float pedirNotas(){
        
        return Float.parseFloat(JOptionPane.showInputDialog("Escribe las notas de los 3 examenes y el numero de boletines"));
        
    }

    public float getExTeo1() {
        return exTeo1;
    }

    public void setExTeo1(float exTeo1) {
        this.exTeo1 = exTeo1;
    }

    public float getExTeo2() {
        return exTeo2;
    }

    public void setExamTeo2(float exTeo2) {
        this.exTeo2 = exTeo2;
    }

    public float getExPrac() {
        return exPrac;
    }

    public void setExPrac(float exPrac) {
        this.exPrac = exPrac;
    }

    public int getNumBoletines() {
        return numBoletines;
    }

    public void setNumBoletines(int numBoletines) {
        this.numBoletines = numBoletines;
    }

    @Override
    public String toString() {
        return "Examen Teorico 1= " + exTeo1 + "\nExament Teorico 2= " + exTeo2 + "\nExamen Practico= " + exPrac+ "\nNumero de Boletines= " + numBoletines ;
    }
    
}
    
