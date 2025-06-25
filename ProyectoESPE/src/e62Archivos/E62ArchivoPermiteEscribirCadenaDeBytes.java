//permite crear un archivo tipo fos
package e62Archivos;

import java.io.FileOutputStream;
import java.io.IOException;

public class E62ArchivoPermiteEscribirCadenaDeBytes {

    //metodo principal
    public static void main(String[] args) {
        FileOutputStream fos = null;

        byte[] cadena = new byte[100];
        int numBytes;
        System.out.println("Ingrese el texto que desea almacenar en el fichero");
        try {
            numBytes = System.in.read(cadena);
            fos = new FileOutputStream("Ruben.txt");
            fos.write(cadena, 0, numBytes);
            //cerrar el fichero
            if (fos != null) {
                fos.close();
            }

        } catch (IOException ex) {
            System.out.println("Error....." + ex.toString());
        }
    }

}
