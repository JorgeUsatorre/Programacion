
package boletin16;


public class Persona {
     private String nome;
     private String apellidos;
     private String NIF;
     
    public Persona(){
        
    }
    
    public Persona (String nome, String apellidos, String NIF) {
        this.NIF = NIF;
        this.apellidos = apellidos;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apellidos;
    }

    public void setApelidos(String apelidos) {
        this.apellidos = apelidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Apellidos=" + apellidos + ", NIF=" + NIF;
    }


    
    
    
}