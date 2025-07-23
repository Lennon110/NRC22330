package e83Strategy;

// Interfaz común para todas las estrategias de pago
public interface EstrategiaAPagar {
    
    // Método que realiza el pago con el monto dado
    // Retorna true si el pago se procesa correctamente, false si falla
    boolean pay(int paymentAmount);
    
    // Método que recopila los datos necesarios para poder realizar el pago
    // Por ejemplo: número de tarjeta, nombre del titular, etc.
    void collectPaymentDetails();
}
