package e80conISP;

public class Halcon implements IAve, IAveVoladora {

    @Override
    public void comer() {
        System.out.println("El halcon come");
    }

    @Override
    public void volar() {
        System.out.println("El halcon vuela");
    }

}
