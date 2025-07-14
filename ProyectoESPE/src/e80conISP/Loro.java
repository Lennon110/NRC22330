package e80conISP;

public class Loro implements IAve, IAveVoladora {

    @Override
    public void comer() {
        System.out.println("El loro come");
    }

    @Override
    public void volar() {
        System.out.println("El loro vuela");
    }

}
