
package boletin.pkg5;


public class Consumo {
    
    //atributos
    private int km;
    private int litros;
    private int vMed;
    private float pGas;
    
    //constructores 
    public Consumo() {
        
    }
    
    
    public Consumo(int km, int litros, int vMed, double pG) {
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    
    //metodos de acceso
    public float getTempo(){
        return (1/vMed * km); //tiempo de viaxe 
    }
    
    public float consumoMedio(){
        return (litros * 100/km);
    }
    
    public float consumoEuros(){
        return ((litros *100 / km) * pGas);
    }
    
    public void setkm (int km) {
        this.km=km;
    }
    
    
    public void setLitros(int litros) {
        this.litros=litros;
    }
    
    public void setVMed(int vMed) {
        this.vMed = vMed;
    }
    
    public int getMed() {
        return vMed; 
    }
    
    public void setPGas(float pGas) {
        this.pGas = pGas;
    }
}