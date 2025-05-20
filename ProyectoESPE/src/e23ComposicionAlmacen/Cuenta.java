
package e23ComposicionAlmacen;

import validar.Leer;

public class Cuenta {
    //atributos
    private int numeroCuenta;
    private int saldo;    

    public Cuenta(){
        this.numeroCuenta = 0;
        this.saldo = 0;
    }
    
    
    public void ingresarCuenta(){
        System.out.println("Ingrese la cuenta: ");
        numeroCuenta = Leer.datosInt();
        //setNumeroCuenta(Leer.datosInt());
        System.out.println("Ingrese el saldo: ");
        saldo = Leer.datosInt();
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }
    
    
    /**
     * @return the numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
