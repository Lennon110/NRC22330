package e79sinISP;

public class Loro implements IAve {

    @Override
    public void volar() {
        System.out.println("El loro vuela");
    }

    @Override
    public void comer() {
        System.out.println("El loro come");
    }

    @Override
    public void nadar() {
        System.out.println("El loro no nada");
    }

}
