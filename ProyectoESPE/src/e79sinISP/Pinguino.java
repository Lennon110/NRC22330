package e79sinISP;

public class Pinguino implements IAve {

    @Override
    public void volar() {
        System.out.println("El pinguino vuela");
    }

    @Override
    public void comer() {
        System.out.println("El pinguino come");
    }

    @Override
    public void nadar() {
        System.out.println("El pinguino no nada");
    }

}
