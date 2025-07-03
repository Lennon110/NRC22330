/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e72CorrecionP2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //variables globales
        char opcion;
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> vector = new ArrayList<Persona>();
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar perssona");
            System.out.println("2. Mostrar las personas");
            System.out.println("3. Borrar la persona indicada");
            System.out.println("4. Actualizar los datos de una persona indica");
            System.out.println("5. Salir");
            System.out.println("Seleccion la opcion: ");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1':
                    //agregarPersona()
                    break;
                case '2':
                    //mostrarPersona();
                    break;
                case '3':
                    //borrarPersona();
                    break;
                case '4':
                    //actualizarPersona();
                    break;
                case '5':
                    //salir
                    break;
                default:
                    System.out.println("Ingreso mal la opcion selecciona nuevamente....");

            }
        } while (opcion != '5');

    }

    private static void agregarPersona() {
        
        ArrayList<Perfil> vectorPerfiles = new ArrayList<Perfil>();
        System.out.println("\nAgregar persona....");
        Perfil perfil = new Perfil(1, "Perfil Persona1");
        vectorPerfiles.add(perfil);
        perfil = new Perfil(1, "Perfil personal");
        vectorPerfiles.add(perfil);

        ArrayList<LugarFrecuente> vectorLugares = new ArrayList<LugarFrecuente>();
        LugarFrecuente lugar = new LugarFrecuente("VacoVaca", "Quito", "123456");
        vectorLugares.add(lugar);
        lugar = new LugarFrecuente("Daniels", "Quito", "123456");
        vectorLugares.add(lugar);

        Foto foto = new Foto("jcw87.github.io/c2-sans-fight/", ".docx", 100.7);

        Persona persona = new Persona("Ruben", "Arroyo", vectorPerfiles, vectorLugares, foto);

    }

}
