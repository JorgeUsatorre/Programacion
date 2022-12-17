
package boletin14;


import boletin14.Partes.CPU;
import boletin14.Partes.Monitor;
import boletin14.Partes.Teclado;

public class Ordenador {
    
    private Monitor mon;
    private Teclado tec;
    private CPU cpu;
    private float precio;

    public Ordenador() {
    }

    public Ordenador(Monitor mon, Teclado tec, CPU cpu, float precio) {
        this.mon = mon;
        this.tec = tec;
        this.cpu = cpu;
        this.precio = precio;
    }

    public Monitor getMon() {
        return mon;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public Teclado getTec() {
        return tec;
    }

    public void setTec(Teclado tec) {
        this.tec = tec;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "" + mon + ", " + tec + ", " + cpu + ", Precio= " + precio ;
    }
   
}
