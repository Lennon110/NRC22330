
package e28Abstracta;

public class Principal {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.radio = 0;
        circulo.Saludar();
        circulo.Perimetro();
        System.out.println("Area: " + circulo.Area());
    }
}
    
