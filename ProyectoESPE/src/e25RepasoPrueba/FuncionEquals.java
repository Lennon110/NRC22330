/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e25RepasoPrueba;

/**
 *
 * @author LABS-ESPE
 */
public class FuncionEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String texto1 = "amarillo";
        String texto2 = "bmarillo".toUpperCase();
        
        if(texto1.equals(texto2)){
            System.out.println("Los textos son iguales");
        }else{
            System.out.println("Los textos son diferentes");
        }
        
        if(texto1.charAt(0) < texto2.charAt(2)){
            System.out.println("si");
        }
        

    }
}
