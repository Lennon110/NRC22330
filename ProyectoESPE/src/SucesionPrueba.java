
import java.util.Scanner;

public class SucesionPrueba {

    public static void main(String[] args) {

        int numero1 = 3, numero2 = 5, numero3, limite, contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el limite: ");
        limite = scanner.nextInt();

        if (limite <= 0) {
            System.out.println("No se puede generar la serie");
        } else if (limite == 1) {
            System.out.println(numero1);
        } else if (limite == 2) {
            System.out.println(numero1 + "   " + numero2);
        } else {
            System.out.print(numero1 + "   " + numero2);

            while (true) {
                for (int i = 0; i < 3; i++) {

                    numero3 = (i == 0 || i == 1) ? (numero2 + numero1) : (numero2 - numero1);
                    System.out.print("   " + numero3);
                    contador++;
                    numero1 = numero2;
                    numero2 = numero3;

                    if (contador == (limite - 2)) {
                        break;
                    }
                }
                if (contador == (limite - 2)) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}

