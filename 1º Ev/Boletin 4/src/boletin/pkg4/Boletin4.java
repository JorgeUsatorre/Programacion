
package boletin.pkg4;


public class Boletin4 {


    public static void main(String[] args) {
    String titulo;
    String autor;
    int ano;
    short numPaginas;
    float valoracion; 
    
    Libro lib1 = new Libro("aaa", "pele",2020,(short)320);
    lib1.amosar();
    Libro lib2 = new Libro();
    lib2.amosar();
    lib2.darAutor("autor");
    lib2.darTitulo("titulo");
    lib2.darAno(2020);
    lib2.darnumPaginas((short)320);
    lib2.darValoracion(9.3f );
    lib2.amosar();
    
    }
    
}
