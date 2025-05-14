 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class E004TrianguloAstericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //atributos o variables
        String nombre;
        int fila;
        Scanner scanner = new Scanner(System.in);
        
        //sentencias
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine(); //se ubica nextLine para que lea hasta un enter
        System.out.print("Ingrese el numero de filas para el triangulo: ");
        fila = scanner.nextInt();
        System.out.println(nombre + " el triangulo de " + fila + " queda asi:");
        for(int i = 0; i < fila; i++){
            for(int k = 0; k <= fila-i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
