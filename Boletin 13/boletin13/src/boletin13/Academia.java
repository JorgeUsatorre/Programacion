
package boletin13;


public class Academia {
    private int nota;
    private int numReferencia = 2018;
    

    public Academia(int nota, int numReferencia) {
        this.nota = nota;
        this.numReferencia = numReferencia;
        numReferencia++;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    @Override
    public String toString() {
        return "Nota= " + nota + ", Numero de referencia= " + numReferencia ;
        
    }
       
}
