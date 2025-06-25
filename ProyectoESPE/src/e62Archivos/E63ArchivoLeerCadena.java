package e62Archivos;

import java.io.*;

public class E63ArchivoLeerCadena {

    public static void main(String[] args) {
        FileInputStream fls = null;
        byte[] cadena = new byte[81];
        int numBytes;

        try {
            fls = new FileInputStream("c:/1/Ruben.txt");
            numBytes = fls.read(cadena, 0, 81);
            String str = new String(cadena, 0, numBytes);
            System.out.println("El texto es: " + str);
            //cerrar el archivo
            if (fls != null) {
                fls.close();
            }

        } catch (IOException ex) {
            System.err.println("Error....." + ex.toString());
        }

    }
}
