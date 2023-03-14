
package boletin27;

public class Libros {
    private String libro;
    private String autor;
    private float precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String libro, String autor, float precio, int unidades) {
        this.libro = libro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libros{" + "libro=" + libro + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
   
}
