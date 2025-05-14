
package e14excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;



public class e15Excepcion2 {


    public static void main(String[] args) {
        
        //InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "0";
        int numero1 = 100;
        
        System.out.print("Ingrese un numero: ");
        try {
            str1 = br.readLine();
            numero1 = Integer.parseInt(str1);
            
            
        } catch (IOException ex) {
            System.out.println("error" + ex.getLocalizedMessage());
        }catch(NumberFormatException ex){
                System.err.println("Error de formato" + ex.getLocalizedMessage());
        }
        
        System.out.println("El numero ingresado es: " + numero1);
    }
    
}
