package e84Adapter;

/*
Clase PiezaCuadrada
Representa una pieza cuadrada que no es compatible directamente con agujeros redondos. 
Fue implementada por un equipo anterior, pero necesita integrarse en el sistema actual.
*/
public class PiezaCuadrada {
    //atributos
    private double ancho;
    
    //constructor
    public PiezaCuadrada(double ancho) {
        this.ancho = ancho;
    }
    
    // Método que devuelve el ancho de la pieza cuadrada
    public double getAncho() {
        return ancho;
    }
    
    // Método auxiliar que devuelve el valor del ancho al cuadrado
    public double getCuadrado() {
        double resultado;
        resultado = Math.pow(this.ancho, 2);
        return resultado;
    }
}
