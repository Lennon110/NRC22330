


/*ufa espe
    carrera patito
    nombre          periodo
    asignatura      nrc
    fecha:
    Tema: programa en java para sumar numeros
*/

import java.util.Scanner;


public class E003SumaNumeros {
    
    public static void main(String[] args) {
         //declaracion var
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        int suma;

        //sentencia
        System.out.print("Ingrese un numero1: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un numero2: ");
        numero2 = scanner.nextInt();
        suma = numero1 + numero2;
        System.out.println("La suma es: "+suma);
    }
}
