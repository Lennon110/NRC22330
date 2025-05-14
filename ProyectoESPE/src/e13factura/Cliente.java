/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e13factura;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Cliente {

    //Atributos
    private String cedula;
    private String nombre;
    private Fecha fechaNacimiento;
    private float peso;

    public Cliente() {
        this.cedula = "111111111";
        this.nombre = "Rubensito";
        this.fechaNacimiento = new Fecha(1, 1, 3000);
        this.peso = 0;
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS CLIENTE");
        System.out.print("Ingrese la cedula: ");
        setCedula(sc.nextLine());
        System.out.print("Ingrese el nombre: ");
        setNombre(sc.nextLine());
        getFechaNacimiento().ingresarDatos();
        System.out.print("Ingrese el peso del cliente: ");
        setPeso(sc.nextFloat());
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + getCedula() + ", nombre=" + getNombre() + ", fechaNacimiento=" + getFechaNacimiento() + ", peso=" + getPeso() + '}';
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
     * @return the fechaNacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

}
