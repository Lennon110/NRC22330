
package e13factura;

import java.util.Scanner;


public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    
    //Constructor vacio

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    
    //ingresar datos
    
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DE LA FECHA");
        System.out.print("Ingrese el dia: ");
        setDia(sc.nextInt());
        System.out.print("Ingrese el mes: ");
        setMes(sc.nextInt());
        System.out.print("Ingrese el anio: ");
        setAnio(sc.nextInt());
    }
    
    //toString

    @Override
    public String toString() {
        return "Fecha: " + getDia() + "/" + getMes() + "/" + getAnio() ;
    }
    
    //get y set

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
