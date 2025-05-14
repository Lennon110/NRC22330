package E009Operaciones;

import java.util.Scanner;


public class E009Operaciones {
     //VARIABLES 
    static int numero1=0, numero2=0;
   
    public static void main(String[] args) {
         //declaracion var
        
        
        int suma;

        //sentencia
        suma = ingresar();
        
        System.out.println("La suma es: "+suma);
    }
    
    public static int ingresar(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero1: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un numero2: ");
        numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        return suma;
    }
}
