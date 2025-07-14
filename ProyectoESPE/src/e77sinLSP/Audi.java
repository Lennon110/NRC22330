package e77sinLSP;

public class Audi extends Coche {

    @Override
    int numAsientosRenault(Coche coche) {
        return 4;
    }

    @Override
    int numAsientosAudi(Coche coche) {
        return 4;
    }

    @Override
    int numAsientosMercedes(Coche coche) {
        return 5;

    }
}
