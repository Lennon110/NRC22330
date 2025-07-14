package e79sinISP;

public class Halcon implements IAve {

    @Override
    public void volar() {
        System.out.println("El halcon vuela");
    }

    @Override
    public void comer() {
        System.out.println("El halcon come");
    }

    @Override
    public void nadar() {
        System.out.println("El halcon no nada");
    }

}
