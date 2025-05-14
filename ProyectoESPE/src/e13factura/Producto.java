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
public class Producto {
    
    //Atributo
    
    private String idProducto;
    private String descripcion;
    private float precio;
    private int cantidad;
    
    //concstructor

    public Producto() {
        this.idProducto = null;
        this.descripcion = "";
        this.precio = 0;
        this.cantidad = 0;
    }
    
    
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS DEL PRODUCTO");
        System.out.print("Ingrese el id: ");
        setIdProducto(sc.nextLine());
        System.out.print("Ingrese la descripcion del produto");
        setDescripcion(sc.nextLine());
        System.out.println("Ingrese la cantidad: ");
        setCantidad(sc.nextInt());
        System.out.println("Ingrese el precio: ");
        setPrecio(sc.nextFloat());
    }

    @Override
    public String toString() {
        return "id Producto: " +  getIdProducto() + ", descripcion=" + getDescripcion() + ", precio=" + getPrecio() + ", cantidad=" + getCantidad() + '}';
    }

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}
