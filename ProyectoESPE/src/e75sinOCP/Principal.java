package e75sinOCP;

import e74conSRP.*;
import e73sinSRP.*;

public class Principal {

    public static void main(String[] args) {
        Coche[] arrayCoches = {new Coche("Renault"),
            new Coche("Audi"),
            new Coche("Mercedes")
        };
        imprimirPrecioMedioCoche(arrayCoches);
    }

    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
        for (Coche coche : arrayCoches) {
            if (coche.marca.equals("Renault")) {
                System.out.println(18000);
            }
            if (coche.marca.equals("Audi")) {
                System.out.println(25000);
            }
            if (coche.marca.equals("Mercedes")) {
                System.out.println(27000);
            }
        }
    }
}
