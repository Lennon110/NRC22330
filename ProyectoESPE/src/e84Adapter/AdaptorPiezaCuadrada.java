package e84Adapter;

/* 
Clase AdaptorPiezaCuadrada.
Esta clase actúa como un adaptador que permite que una pieza cuadrada se comporte como una pieza redonda. 
Se utiliza para que una pieza cuadrada pueda encajar en un agujero redondo, 
calculando el radio equivalente necesario.
 */
public class AdaptorPiezaCuadrada extends PiezaRedonda {

    //atributos
    private PiezaCuadrada pieza;

    //constructor
    public AdaptorPiezaCuadrada(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }
    
    // método que devuelve el radio equivalente que ocuparía la pieza cuadrada
    @Override
    public double getRadio() {
        double resultado;
        // Calcula el radio mínimo de un círculo que pueda contener el cuadrado (mitad de la diagonal)
        resultado = (Math.sqrt(Math.pow((pieza.getAncho() / 2), 2) * 2));
        return resultado;
    }
}
