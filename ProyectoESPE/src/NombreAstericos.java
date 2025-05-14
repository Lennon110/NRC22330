/*
    Universidad de las Fuerzas Armadas ESPE
    Carrera: Software
    Nombre: Lennon Arias    Período: SI ABR25 - AGO25
    Asignatura: POO         NRC: 223300
    Fecha: 24/04/2025
    Tema: Progama en Java que permita mostrar e ingresar: a)Nombre b)Numero de filas para dibujar un triango de asteriscos
*/

//librerias
import java.util.Scanner;

public class NombreAstericos{
    
    //metodo principal
    public static void main(String[] args) {
        //declaracion variables
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int numeroFilas;
        
        //sentencia
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingrese el numero de filas: ");
        numeroFilas = scanner.nextInt();
        
        System.out.println("Su nombre es: "+nombre);
                
        for(int i = 1; i <= numeroFilas; i++){
            for(int j = 1; j <= numeroFilas - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        

    }
}