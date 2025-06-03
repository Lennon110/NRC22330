
package e29Implements;

public class CirculoImplementa implements Circulo{
    //atributos
    private double radio;
    
    //constructor por defecto
    public CirculoImplementa(){
        this.radio = 0.0;
    }

    @Override
    public double getRadio() {
        return radio;
    }

    @Override
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public double getPerimetro() {
        return (2*Math.PI*radio);
    }
}
