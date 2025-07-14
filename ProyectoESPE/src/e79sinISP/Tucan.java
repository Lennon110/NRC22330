package e79sinISP;

public class Tucan implements IAve {

    @Override
    public void volar() {
        System.out.println("El tucan vuela");
    }

    @Override
    public void comer() {
        System.out.println("El tucan come");
    }

    @Override
    public void nadar() {
        System.out.println("El tucan no nada");
    }

}
