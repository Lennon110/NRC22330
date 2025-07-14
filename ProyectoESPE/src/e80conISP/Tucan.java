package e80conISP;

public class Tucan implements IAve, IAveVoladora {

    @Override
    public void comer() {
        System.out.println("El tucan come");
    }

    @Override
    public void volar() {
        System.out.println("El tucan vuela");
    }

}
