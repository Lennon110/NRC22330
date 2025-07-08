package e75sinOCP;

import e74conSRP.*;
import e73sinSRP.*;

public class Coche {

    //atributos
    String marca;
    //constructor con argumento

    Coche(String marca) {
        this.marca = marca;
    }

    //metodo para devolver el atributo marca(get)
    String getMarcaCoche() {
        return marca;
    }
}
