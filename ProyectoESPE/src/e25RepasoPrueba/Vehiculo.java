
package e25RepasoPrueba;

import java.util.Scanner;

public class Vehiculo {
    //atributos
    private String placa;
    private String marca;
    private Fecha fecha;
    private double costo;
    
    //constructor
    public Vehiculo(){
        this.placa = null;
        this.marca = null;
        this.fecha = new Fecha();
        this.costo = 0; 
    }
    
    //ingresar datos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DE LA FECHA");
        System.out.print("Ingrese placa: ");
        setPlaca(sc.nextLine());
        System.out.print("Ingrese la marca: ");
        setMarca(sc.nextLine());
        getFecha().ingresarDatos();
        System.out.println("Ingrese el costo vehiculo: ");
        setCosto(sc.nextDouble());
    }
    
    @Override
    public String toString(){
        return this.getPlaca() + "\t" + getMarca() + "\t" + getFecha() + "\t" + getCosto();
    } 
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}

