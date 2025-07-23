package e83Strategy;

//liberias
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Clase PagarconTarjetadeCredito.
Clase que representa una estrategia concreta de pago mediante tarjeta de crédito.
Implementa la interfaz EstrategiaAPagar, permitiendo ingresar los datos de la tarjeta,
almacenarlos en un objeto TarjetadeCredito y realizar el pago si los datos han sido ingresados
 */
public class PagarconTarjetadeCredito implements EstrategiaAPagar {

    //atributos
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private TarjetadeCredito card;

    // Método que solicita e ingresa los datos necesarios de la tarjeta de crédito
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Ingrese el numero de tarjeta: ");
            String number = READER.readLine();
            System.out.print("Ingrese la fecha de expiracion de la tarjeta 'mm/aa': ");
            String date = READER.readLine();
            System.out.print("Ingrese el codigo CVV: ");
            String cvv = READER.readLine();
            card = new TarjetadeCredito(number, date, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Método que realiza el pago si los datos de la tarjeta son validos
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Pagando " + paymentAmount + " usando tarjeta de credito.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }
    
    // Método auxiliar que verifica si la tarjeta ha sido ingresada
    private boolean cardIsPresent() {
        return card != null;
    }

}
