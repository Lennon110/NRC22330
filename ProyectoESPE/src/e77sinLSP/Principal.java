package e77sinLSP;

public class Principal {

    public static void main(String[] args) {
        Coche[] arrayCoches = {
            new Renault(),
            new Audi(),
            new Mercedes()
        };
        imprimirNumAsientos(arrayCoches);
    }

    public static void imprimirNumAsientos(Coche[] arrayCoches) {

        for (Coche coche : arrayCoches) {
            if (coche instanceof Renault) {
                System.out.println(numAsientosRenault(coche));
            }
            if (coche instanceof Audi) {
                System.out.println(numAsientosAudi(coche));
            }
            if (coche instanceof Mercedes) {
                System.out.println(numAsientosMercedes(coche));
            }
        }
    }

    private static int numAsientosRenault(Coche coche) {
        return 100;
    }

    private static int numAsientosAudi(Coche coche) {
        return 101;

    }

    private static int numAsientosMercedes(Coche coche) {
        return 102;

    }

}
