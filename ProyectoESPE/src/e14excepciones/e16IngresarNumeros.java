package e14excepciones;


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;

import java.io.*;
import java.util.*;

public class e16IngresarNumeros {


    public static void main(String[] args) {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);        
        PrintStream flujoS = System.out;
        
        String str1, str2;
        int numero1 = 0, numero2 = 0, numero3=1;
        
        
        try {
            System.out.print("Ingrese numero1: ");
            str1 = br.readLine();
            System.out.print("Ingrese numero 2: ");
            str2 = br.readLine();
            
            
            numero1 = Integer.parseInt(str1);
            numero2 = Integer.parseInt(str2);
            numero3 = numero1/numero2;
            rango(str1);
   
            
        } catch (IOException ex) {
            System.out.println("error" + ex.getLocalizedMessage());
        }catch(NumberFormatException ex){
            System.err.println("Error de formato " + ex.getLocalizedMessage());
        }catch(ArithmeticException Ex){
            System.out.println("Error de division por cero...");
        }catch (ExceptionRubensito ex) {
            System.out.println("Error de rango rubensito".toUpperCase());
        }
        
        flujoS.println("El numero 1 es: " + numero1);
        flujoS.println("El numero 2 es: " + numero2);
        flujoS.println("El numero 3 es: " + numero3);
    }

    private static void rango(String texto1) throws ExceptionRubensito {
        
        int numero1 = 1;
        try{
            numero1 = Integer.parseInt(texto1);
        }catch(NumberFormatException ex){
            System.out.println(ex.toString());
        }
        
        
        if(numero1 >100){
            throw new ExceptionRubensito();
        }
    }
}