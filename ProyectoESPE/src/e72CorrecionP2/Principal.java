package e72CorrecionP2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //variables globales
        char opcion;
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> vector = new ArrayList<>();

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar las personas");
            System.out.println("3. Borrar la persona indicada");
            System.out.println("4. Actualizar los datos de una persona indicada");
            System.out.println("5. Salir");
            System.out.println("Seleccion la opcion: ");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1':
                    agregarPersona(vector);
                    break;
                case '2':
                    mostrarPersona(vector);
                    break;
                case '3':
                    borrarPersona(vector);
                    break;
                case '4':
                    actualizarPersona(vector);
                    break;
                case '5':
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Ingreso mal la opcion selecciona nuevamente....");

            }
        } while (opcion != '5');

    }

    private static void agregarPersona(ArrayList<Persona> vector) {

        ArrayList<Perfil> perfiles = new ArrayList<>();
        ArrayList<LugarFrecuente> lugaresFrecuentes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char opcion;

        System.out.println("INGRESO DE DATOS DE LA PERSONA: ");
        System.out.println("Ingrese el nombre de la persona: ");
        String nombrePersona = sc.nextLine();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellidoPersona = sc.nextLine();

        do {
            System.out.println("INGRESO DE PERFILES DE LA PERSONA:");
            System.out.println("Ingrese el numero de perfil: ");
            int numeroPerfil = sc.nextInt();
            System.out.println("Ingrese la descripcion del perfil: ");
            sc.nextLine();
            String descripcion = sc.nextLine();
            System.out.println("Desea ingresar otro perfil? (s/n)");
            Perfil perfil = new Perfil(numeroPerfil, descripcion);
            perfiles.add(perfil);
            opcion = sc.next().charAt(0);
            sc.nextLine();
        } while (opcion != 'n');

        do {
            System.out.println("INGRESO DE LUGARES FRECUENTES DE LA PERSONA: ");
            System.out.println("Ingrese el nombre del lugar: ");
            String nombreLugar = sc.nextLine();
            System.out.println("Ingrese la direccion del lugar: ");
            String direccionLugar = sc.nextLine();
            System.out.println("Ingrese el telefono del lugar: ");
            String telefonoLugar = sc.nextLine();
            System.out.println("Desea ingresar otro perfil? (s/n)");
            LugarFrecuente lugarFrecuente = new LugarFrecuente(nombreLugar, direccionLugar, telefonoLugar);
            lugaresFrecuentes.add(lugarFrecuente);
            opcion = sc.next().charAt(0);
            sc.nextLine();
        } while (opcion != 'n');

        System.out.println("INGRESO DE DATOS DE LA FOTO: ");
        System.out.println("Ingrese el path de la foto: ");
        String path = sc.nextLine();
        System.out.println("Ingrese el tipo de archivo de la foto: ");
        String tipoArchivo = sc.nextLine();
        System.out.println("Ingrese el tamanio de la foto: ");
        double tamanio = sc.nextDouble();
        Foto foto = new Foto(path, tipoArchivo, tamanio);

        Persona persona = new Persona(nombrePersona, apellidoPersona, perfiles, lugaresFrecuentes, foto);
        vector.add(persona);
    }

    private static void mostrarPersona(ArrayList<Persona> vector) {
        Iterator<Persona> it;
        int numeroPersona = 1;
        for (it = vector.iterator(); it.hasNext();) {
            System.out.println("PERSONA " + numeroPersona + "");
            System.out.println(it.next());
            System.out.println();
            numeroPersona++;
        }
    }

    private static void borrarPersona(ArrayList<Persona> vector) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona que desea eliminar: ");
        String nombre = sc.nextLine();
        Iterator<Persona> it;
        for (it = vector.iterator(); it.hasNext();) {
            Persona persona = it.next();
            if (persona.getNombre().equals(nombre)) {
                it.remove();
                System.out.println("Persona eliminada");
            }
        }
    }

    private static void actualizarPersona(ArrayList<Persona> vector) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona que desea actualizar datos: ");
        String nombre = sc.nextLine();
        Iterator<Persona> it;
        for (it = vector.iterator(); it.hasNext();) {
            Persona persona = it.next();
            if (persona.getNombre().equals(nombre)) {
                System.out.println("DATOS DE LA PERSONA: ");
                System.out.println(persona);

                char opcion;
                System.out.println("\nACTUALIZACION DE DATOS DE LA PERSONA");

                System.out.println("Desea actualizar el nombre? (s/n): ");
                opcion = sc.next().charAt(0);
                sc.nextLine();
                if (opcion == 's') {
                    System.out.println("Ingrese el nombre de la persona: ");
                    String nuevoNombre = sc.nextLine();
                    persona.setNombre(nuevoNombre);
                }

                System.out.println("Desea actualizar el apellido? (s/n): ");
                opcion = sc.next().charAt(0);
                sc.nextLine();
                if (opcion == 's') {
                    System.out.println("Ingrese el apellido de la persona: ");
                    String nuevoApellido = sc.nextLine();
                    persona.setApellido(nuevoApellido);
                }

                System.out.println("Desea actualizar los perfiles? (s/n): ");
                opcion = sc.next().charAt(0);
                sc.nextLine();
                if (opcion == 's') {
                    ArrayList<Perfil> nuevosPerfiles = new ArrayList<>();

                    do {
                        System.out.println("INGRESO DE PERFILES DE LA PERSONA:");
                        System.out.println("Ingrese el numero de perfil: ");
                        int numeroPerfil = sc.nextInt();
                        System.out.println("Ingrese la descripcion del perfil: ");
                        sc.nextLine();
                        String descripcion = sc.nextLine();
                        System.out.println("Desea ingresar otro perfil? (s/n)");
                        Perfil perfil = new Perfil(numeroPerfil, descripcion);
                        nuevosPerfiles.add(perfil);
                        opcion = sc.next().charAt(0);
                        sc.nextLine();
                    } while (opcion != 'n');
                    persona.setPerfiles(nuevosPerfiles);
                }

                System.out.println("Desea actualizar los lugares frecuentes? (s/n): ");
                opcion = sc.next().charAt(0);
                sc.nextLine();
                if (opcion == 's') {
                    ArrayList<LugarFrecuente> nuevosLugares = new ArrayList<>();

                    do {
                        System.out.println("INGRESO DE LUGARES FRECUENTES DE LA PERSONA: ");
                        System.out.println("Ingrese el nombre del lugar: ");
                        String nombreLugar = sc.nextLine();
                        System.out.println("Ingrese la direccion del lugar: ");
                        String direccionLugar = sc.nextLine();
                        System.out.println("Ingrese el telefono del lugar: ");
                        String telefonoLugar = sc.nextLine();
                        System.out.println("Desea ingresar otro perfil? (s/n)");
                        LugarFrecuente lugarFrecuente = new LugarFrecuente(nombreLugar, direccionLugar, telefonoLugar);
                        nuevosLugares.add(lugarFrecuente);
                        opcion = sc.next().charAt(0);
                        sc.nextLine();
                    } while (opcion != 'n');
                    persona.setLugaresFrecuentes(nuevosLugares);
                }

                System.out.println("Desea actualizar los datos de la foto? (s/n): ");
                opcion = sc.next().charAt(0);
                sc.nextLine();
                if (opcion == 's') {
                    System.out.println("INGRESO DE DATOS DE LA FOTO: ");
                    System.out.println("Ingrese el path de la foto: ");
                    String path = sc.nextLine();
                    System.out.println("Ingrese el tipo de archivo de la foto: ");
                    String tipoArchivo = sc.nextLine();
                    System.out.println("Ingrese el tamanio de la foto: ");
                    double tamanio = sc.nextDouble();
                    Foto nuevafoto = new Foto(path, tipoArchivo, tamanio);
                    persona.setFoto(nuevafoto);
                }
            }
        }
    }

}
