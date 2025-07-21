package e83Strategy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PagarconPayPal implements EstrategiaAPagar {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("sebas", "123");
        DATA_BASE.put("steven", "456");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Ingrese el usuario: ");
                email = READER.readLine();
                System.out.print("Ingrese la contraseña: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Los datos han sido verificados.");
                } else {
                    System.out.println("Contraseña incorrecta!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("pagando " + paymentAmount + " usar Paypal.");
            return true;
        } else {
            return false;
        }
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
    
    
    
}
