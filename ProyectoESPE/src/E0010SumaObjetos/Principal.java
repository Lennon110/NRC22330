
package E0010SumaObjetos;

import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        Numero suma = new Numero();
        
        //Ingresar dato a un objeto
        System.out.println("Ingrese un numero 1: ");
        numero1.setValor(sc.nextInt());
        
        System.out.println("Ingrese un numero2: ");
        numero2.setValor(sc.nextInt());
        
        System.out.println("El numero 1 es: " + numero1.getValor());
        System.out.println("El numero 2 es: " + numero2.getValor());
        
        suma.setValor(numero1.getValor() + numero2.getValor());
        System.out.println("La suma es " + suma.getValor());
    }
    
}
