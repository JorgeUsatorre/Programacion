package boletin18;

public class ConversorTemperaturas {
    final float TEMPERATURA_MINIMA = 80;

    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80ºC");
        }
        return 9.0f / 5.0f * centigrados + 32.4f;
    }

    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80ºC");
        }
        return 4.0f / 5.0f * centigrados;
    }
}