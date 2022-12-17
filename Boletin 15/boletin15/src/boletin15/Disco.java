
package boletin15;


public class Disco extends Multimedia{
    
    private String xenero;

    public Disco() {
        super();
    }

    public Disco(String xenero, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        return (super.getTitulo() + ", Xenero=" + xenero);
    }
    
  
    
}
