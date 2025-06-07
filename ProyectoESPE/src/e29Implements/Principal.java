
package e29Implements;

public class Principal {
    public static void main(String[] args) {
        CirculoImplementa circulo = new CirculoImplementa(9);
        System.out.println("El area del circulo es: "  + Math.floor((double) circulo.getArea()));
        System.out.println("El radio del circulo es: " + circulo);
    }
    
}
