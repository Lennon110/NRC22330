//02/06/2025
package e27PolimorfismoPersona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {   
        ArrayList<Persona> vector = new ArrayList<>();
        Persona persona;
        Scanner leer = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("\n\nMENU");
            System.out.println("1. Ingresar persona");
            System.out.println("2. Ingresar profesor");
            System.out.println("3. Ingresar administrador");
            System.out.println("4. Ingresar estudiante");
            System.out.println("5. Mostrar Datos");
            System.out.println("6. Salir");
            System.out.print("Seleccione la opcion: ");
            opcion = leer.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.println("1. Persona: ");
                    persona = new Persona();
                    persona.ingresarDatos();
                    vector.add(persona);
                    break;
                case '2':
                    System.out.println("2. Profesor: ");
                    persona = new Profesor();
                    persona.ingresarDatos();
                    vector.add(persona);
                    break;
                case '3':
                    System.out.println("3. Administrativo: ");
                    persona = new Administrativo();
                    persona.ingresarDatos();
                    vector.add(persona);
                    break;
                case '4':
                    System.out.println("4. Estudiante: ");
                    persona = new Estudiante();
                    persona.ingresarDatos();
                    vector.add(persona);
                    break;
                case '5':
                    Iterator<Persona> it;
                    for(it = vector.iterator(); it.hasNext();){
                        it.next().mostrarDatos();
                        System.out.println();
                    }
                    break;
                case '6':
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != '6');
    }
}

//ESTOS METODOS DE AQUI SON METODOS CONCRETOS
//METODO SIN CUERPO ES ABSTRACTO
//ABSTRACTO METODO SIN CUERPO, TERMINA CON PUNTO Y COMA
//CLASE ABSTRACTA -> METODO ABSTRACTO
//CLASE ABSTRACTA PUEDE TENER METODOS CONCRETOS,PERO UNA CLASE CONCRETA NO PUEDE TENER UN METODO ABSTRACTO