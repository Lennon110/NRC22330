package e73sinSRP;

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

    //metodo para guardar los datos
    void guardarCocheDB(Coche coche) {
        System.out.println("Aqui se guarda los datos del coche en la bdd");
    }
}
