
package e14excepciones;

public class ExceptionRubensito extends Exception {

    public ExceptionRubensito() {
        System.out.println("Excepcion propia");
    }
    
    public ExceptionRubensito(String texto) {
        System.out.println("MEEEESSI");
    }
}
