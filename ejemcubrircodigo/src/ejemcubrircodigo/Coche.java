
package ejemcubrircodigo;


public class Coche {
    private String marca;
    private float precio;

    public Coche(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
    
}
