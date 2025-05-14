
package e14excepciones;

public class e14Excepcion1 {


    public static void main(String[] args) {
        
        // declaraciones
        
        int numero1, numero2, suma;
        
        try{
            
            String str1 = "*", str2 = "7", str3 = "0";
            numero1 = Integer.parseInt(str1);
            
            numero2 = 7;

            suma = numero1 + numero2;
            System.out.println("El numero 1 es: " + numero1);
            System.out.println("El numero 2 es: " + numero2);
            System.out.println("La suma es: " + suma);
            
        }catch(NumberFormatException variable){
            numero1 = 100;                    
            System.out.println("Error de letra " + variable.toString());
        }
        
        
    }
    
}
