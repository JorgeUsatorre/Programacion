
package ejemploherencia;


public class EstudianteInternacional  extends Estudiante {
    
    private String pais;

    public EstudianteInternacional(String pais, String Cole, String nivel, String n, String di) {
        super(Cole, nivel, n, di);
        this.pais = pais;
    }

    public EstudianteInternacional() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  (super.toString() + "pais= " + pais);
    }
    
    
    
}
