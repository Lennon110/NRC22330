
import java.util.Scanner;

public class e31ValidarPesoCosto {

    public static void main(String[] args) {
        //declarar
        float peso, costo;
        costo = 0;
        Scanner leer = new Scanner(System.in);

        //validar
        do {
            System.out.print("Ingrese el peso: ");
            peso = leer.nextFloat();
            if (peso <= 0) {
                System.err.println("Error, vuelva a ingresar el peso");
            }
        } while (peso <= 0);

        if (peso <= 2) {
            costo = 5;
        } else {
            if (peso <= 5) {
                costo = 10;
            } else {
                if (peso <= 10) {
                    costo = 15;
                } else {
                    costo = 20;
                }
            }
        }

        System.out.println("Peso: " + peso + "\tCosto: " + costo);

    }

}
