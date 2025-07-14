package e78conLSP;

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
            System.out.println(coche.numAsientos());
        }
    }

}
