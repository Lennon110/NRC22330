
package e28Abstracta;

public class Circulo extends Figura {
    float radio;

    @Override
    public void Perimetro() {
        System.out.println("Perimetro: " + Math.ceil(2*Math.PI*radio));
    }

    @Override
    public float Area() {
        return (float) (Math.PI*Math.pow(radio, 2));
    }
}
