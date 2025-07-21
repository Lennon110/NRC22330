package e83Strategy;

import java.io.*;

public class PagarconTarjetadeCredito implements EstrategiaAPagar {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private TarjetadeCredito card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.println("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new TarjetadeCredito(number, date, cvv);

            //Validate credit card number...
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("pagando" + paymentAmount + " usando tarjeta de credito.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
    
}
