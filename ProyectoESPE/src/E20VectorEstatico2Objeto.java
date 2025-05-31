
import java.util.Scanner;


public class E20VectorEstatico2Objeto {

    public static void main(String[] args) {
        
        Double []vector = {1.0,2.0,3.0,4.0,5.0}; //Declarar e inicializar
        double suma=0;
        
        //Inicializar
        for(int i = 0; i < vector.length ; i++){
            vector[i] = (double) i;
        }
        
        //Ingresar
        for(int i = 0; i < vector.length ; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector[i] = scanner.nextDouble();
            suma += vector[i];
        }
        
        //Mostrar
        for(int i = 0; i < vector.length ; i++){
            System.out.print(vector[i] + "\t");
        }
        System.out.println("\nLa suma es " + suma);
    }
    
}
