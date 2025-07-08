package e74conSRP;

import e73sinSRP.*;

public class Principal {

    public static void main(String[] args) {
        Coche coche = new Coche("Ford");
        System.out.println(coche.getMarcaCoche());
        CocheBD cocheBD = new CocheBD();
        cocheBD.guardarCocheDB(coche);
        cocheBD.eliminarCocheDB(coche);
    }

}
