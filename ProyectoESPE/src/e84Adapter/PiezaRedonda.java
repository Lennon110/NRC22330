package e84Adapter;

/*
Clase PiezaRedonda
Representa una pieza redonda que es compatible con los agujeros redondos.
 */
public class PiezaRedonda {

    //atributos
    private double radio;

    //constructor por defecto
    public PiezaRedonda() {
    }

    //constructor con parametros
    public PiezaRedonda(double radio) {
        this.radio = radio;
    }

    //método que devuelve el radio de la pieza
    public double getRadio() {
        return radio;
    }
}
