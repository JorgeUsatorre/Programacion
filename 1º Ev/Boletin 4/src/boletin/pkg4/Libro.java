
package boletin.pkg4;


public class Libro {
       //atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion; 
    
    
    //constructores 
    
    public Libro() {
        
    }
    
    public Libro(String tit, String autor, int ano, short numPag) {
        titulo=tit;
        this.autor=autor;
        this.ano=ano;
        numPaginas=numPag;
    }
        
        //metodos de acceso a setters y getters
    public void darTitulo(String tit) { //corresponde a serTitulo
        titulo= tit;
    }
    
    public String devolverTitulo() { //corresponde a getTitulo
        return titulo;
    }

    
    public void darAutor(String aut){ //corresponde a setAutor
     autor = aut;
    }
    
    public String devolverAutor(){ //equivale a getAutor
        return autor;
    }
    
    public void darAno(int an) { //corresponde a setAno
        ano = an;
    }
    
    public int devolverAno(){ //equivale a getAno
        return ano;
    }
    
    public void darnumPaginas(short numPag){ //equivale a setnumPaginas
        numPaginas=numPag;
    }
    
    public short devolvernumPaginas() { //equivale a getnumPaginas
        return numPaginas;
    }

    public void darValoracion(float valo){ //equivale a setValoracion 
        valoracion = valo;
    }
        
    public float devolverValoracion() { //equivale a getValoracion
        return valoracion;
    }
    
    public void amosar() {
        System.out.println("autor"+ autor+ "\n titulo"+ titulo+"\n paxinas"+ numPaginas+ "\n valoración"+ valoracion );
    }
}
