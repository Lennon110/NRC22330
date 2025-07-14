package e80conISP;

public class Pinguino implements IAve, IAveNadadora {

    @Override
    public void comer() {
        System.out.println("El pinguino come");
    }

    @Override
    public void nadar() {
        System.out.println("El pinguino nada");
    }
    
}
