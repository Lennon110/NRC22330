
import java.util.Scanner;

public class E008Prueba1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int numero1 = 3;
        int numero2 = 5;
        int limite = 255454546, i = 3, numero3, numero4, numero5;
        
        System.out.println("Ingrese el limite: ");
        limite = scanner.nextInt();
        
        if (limite <= 0){
            System.out.println("No se puede generar la serie");
        }else{
            //serie
            if(i < 2){
                System.out.print(numero1 + "\t");
                
            }
            
            System.out.println(numero2 + "\t");
            i=3;
            while(i < limite){
                
                numero3 = numero2 + numero1;
                System.out.print(numero3 + "\t");
                
                numero4 = numero3 + numero2;
                System.out.print(numero4 + "\t");
                
                numero5 = numero4 - numero3;
                System.out.print(numero5 + "\t");
                
                i = i+3;
                numero1 = numero4;
                numero2 = numero5;
                
            }
        }
    }
}
