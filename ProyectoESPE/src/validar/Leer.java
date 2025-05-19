
package validar;


import java.io.*;

public class Leer {
    //Atributos
    //Constructor
    //metodo para ingresar un dato tipo string
    public static String datos(){
        String sdato = null; 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader (isr);
        try {
            sdato=flujoE.readLine();
        } catch (IOException ex) { //error
            //Logger.getLogger(leer.class.getName()).log(Level.SEVERE, null, ex);}
            System.err.println("Error de Ingreso... " + ex.getMessage());
        } 
        return sdato;
    }
    //metodo para ingresar un dato tipo int
    public static int datosInt(){
        try{
            //cambio de tipo string a entero
            return Integer.parseInt(datos());
        }catch (NumberFormatException e){//error
            System.err.println("Error... " +e.getMessage());
            return Integer.MAX_VALUE;
        }
    }
    
    //metodo para ingresar un dato tipo int
    public static float datosFloat(){
        try{
            //cambio de tipo string a float
            return Float.parseFloat(datos());
        }catch (NumberFormatException e){//error
            System.err.println("Error... " +e.getMessage());
            return Float.MIN_VALUE;
        }
    }
}