
import java.util.Scanner;


public class E19VectorEstatico {

    public static void main(String[] args) {
        
        int vector[] = {1,2,3,4,5}; //Declarar e inicializar
        int[] vector2 = new int[3]; //Declarar
        int suma=0;
        
        //Inicializar
        for(int i = 0; i < vector2.length ; i++){
            vector2[i] = i;
        }
        
        //Ingresar
        for(int i = 0; i < vector2.length ; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector2[i] = scanner.nextInt();
            suma = suma + vector[i];
        }
        
        //Mostrar
        for(int i = 0; i < vector2.length ; i++){
            System.out.print(vector2[i] + "\t");
        }
        System.out.println("La suma es " + suma);
    }
    
}
