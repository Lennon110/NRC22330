package e23ComposicionAlmacen;

public class Almacen {
    //atributos
    private String nombre;
    private Cuenta cuenta;

    public Almacen() {
        this.nombre = "FeelGoodInc";
        this.cuenta = new Cuenta();
    }
    
    //metodo ingreso
    public void ingresoAlmacen(){
        //System.out.println("Ingrese el numero de cuenta");
        cuenta.ingresarCuenta();
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombre=" + getNombre() + ", cuenta=" + getCuenta().toString() + '}';
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    


}
