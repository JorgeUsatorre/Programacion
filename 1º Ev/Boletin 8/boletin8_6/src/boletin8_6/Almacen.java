
package boletin8_6;


public class Almacen {
    
    private String nombre;
    private int numventas;
    private String tipo;

    public Almacen(String nombre,int n_ventas){
        this.nombre = nombre;
        this.numventas = numventas;
    }
    public Almacen(){

    }

    public String getNombre() {
        return nombre;
    }

    public int getNumventas() {
        return numventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumventas(int numventas) {
        this.numventas = numventas;
    }

    public int ponerTipo(Almacen producto){
        return 1;
    }


    public void tipoArticulo(){
        if(this.numventas <= 100){
            this.tipo = "bajo";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo " + this.tipo);
        }
        else if (this.numventas < 100 && this.numventas<=500) {
            this.tipo = "medio";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo " + this.tipo);
        }
        else if (this.numventas >500 && this.numventas<=1000 ) {
            this.tipo = "alto";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo " + this.tipo);
        }
        else {
            this.tipo = "Primera Necesidad";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo " + this.tipo);
        }
    }
}


