
package ejemploherencia;

public class Ensinante extends Persona{
    
    private String materia;

    public Ensinante() {
    }

    public Ensinante(String materia) {
        this.materia = materia;
    }

    public Ensinante(String materia, String nome, String direccion) {
        super(nome, direccion);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return (super.toString() + ", materia= " + materia);
        
    }
    
    
    
    
    
    
}
