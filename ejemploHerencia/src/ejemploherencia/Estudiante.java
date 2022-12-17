
package ejemploherencia;


public class Estudiante extends Persona {
    
    private String nomeCole;
    private String nivel;

    public Estudiante() {
        super();
    }

    public Estudiante(String Cole, String nivel, String n, String di) {
        super(n, di);
        this.nomeCole = Cole;
        this.nivel = nivel;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return (super.toString() + "nomeCole= " + nomeCole + ", nivel= " + nivel);
    }

    

    


    
}
