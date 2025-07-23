package e83Strategy;

//liberias
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Clase PagarconPayPal.
Clase concreta que implementa la estrategia de pago usando PayPal
Simula una verificación de usuario con email y contraseña, y luego permite realizar el pago
 */
public class PagarconPayPal implements EstrategiaAPagar {

    //atributos
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    // Bloque estático que inicializa una base de datos simulada
    static {
        DATA_BASE.put("123", "sebas");
        DATA_BASE.put("456", "steven");
    }

    // Método que recolecta los datos necesarios para el pago
    // Solicita al usuario que ingrese email y contraseña
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Ingrese el usuario: ");
                email = READER.readLine();
                System.out.print("Ingrese la contrasenia: ");
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
    
    // Método privado que verifica si los datos ingresados coinciden con la base de datos
    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }
    
    // Método que realiza el pago si el usuario está autenticado
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Pagando " + paymentAmount + " usando Paypal.");
            return true;
        } else {
            return false;
        }
    }
    
    // Método para establecer el estado de autenticación del usuario
    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

}
