/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e21VectorObjetos;

/**
 *
 * @author LABS-ESPE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] vector = new Persona[4];
        
        for (int i = 0; i < vector.length; i++) {
            Persona persona = new Persona();
            vector[i] = persona;
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i].toString());
            
        }
    }
    
}
