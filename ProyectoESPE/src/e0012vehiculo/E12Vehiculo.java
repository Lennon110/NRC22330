/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e0012vehiculo;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class E12Vehiculo {
    
    //atribtuos
    
    private String numeroSerie;
    private String placa;
    private float peso;
    
    //metodos
    
    //metodos Usuario
    public void ingresarDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numeroSerie: ");
        this.setNumeroSerie(leer.nextLine());
        System.out.print("Ingresa la placa: ");
        setPlaca(leer.nextLine());
        System.out.print("Ingresa el peso: ");
        setPeso(leer.nextInt());

    }
    
    //mostrar

    @Override
    public String toString() {
        return "E12Vehiculo{" + "numeroSerie=" + getNumeroSerie() + ", placa=" + getPlaca() + ", peso=" + getPeso() + '}';
    }
    
    //get y set

    /**
     * @return the numeroSerie
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @param numeroSerie the numeroSerie to set
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
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

    /**
     * @return the peso
     */

    
}
