package e84Adapter;

/*
Clase AgujeroRedondo.
Representa un agujero redondo que solo acepta piezas redondas.
 */
public class AgujeroRedondo {

    //atributos
    private double radio;

    //constructor
    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }

    // Método que devuelve el radio del agujero
    public double getRadio() {
        return radio;
    }
    
    // Método que verifica si una pieza redonda encaja en el agujero
    public boolean encaja(PiezaRedonda pieza) {
        boolean resultado;
        resultado = (this.getRadio() >= pieza.getRadio());
        return resultado;
    }
}
