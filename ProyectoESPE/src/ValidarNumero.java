
import java.util.Scanner;

public class ValidarNumero {

    public static void main(String[] args) {

        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, suma;

        System.out.print("Ingrese numero 1: ");
        str1 = scanner.next();
        System.out.print("Ingrese numero 2: ");
        str2 = scanner.next();

        if (esEntero(str1) && esEntero(str2)) {
            numero1 = Integer.parseInt(str1);
            numero2 = Integer.parseInt(str2);
            suma = numero1 + numero2;
            System.out.println("La suma es: " + suma);
        } else {
            System.out.println("No se puede realizar la suma");
        }
    }

    public static boolean esEntero(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        int indice = 0;

        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            indice = 1;
        }

        for (int i = indice; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
