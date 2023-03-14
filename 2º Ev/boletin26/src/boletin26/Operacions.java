package boletin26;

public class Operacions <T extends Comparable<T>> {
    
    public T calcularMinimo(T[] lista) {
        T minimo = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i].compareTo(minimo) < 0) {
                minimo = lista[i];
            }
        }
        return minimo;
    }
    
    public T calcularMaximo(T[] lista) {
        T maximo = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i].compareTo(maximo) > 0) {
                maximo = lista[i];
            }
        }
        return maximo;
    }
    
    public int buscarObjeto(T[] lista, T objeto) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(objeto)) {
                return i;
            }
        }
        return -1;
    }
    public T eliminar(T[] lista, T objeto) {
    int obxBusc = buscarObjeto(lista, objeto);
    if (obxBusc != -1) {
        T eliminar = lista[obxBusc];
        for (int i = obxBusc; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[lista.length - 1] = null;
        return eliminar;
    }
    return null;
}

}

    
    
    
