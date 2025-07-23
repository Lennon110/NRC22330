package e83Strategy;

/* 
Clase TarjetadeCredito
Representa una tarjeta de crédito simple para simular un pago.
*/ 
public class TarjetadeCredito {
    //atributos
    private int amount;
    private String number;
    private String date;
    private String cvv;
    
    //constructor inicializa la tarjeta monto predeterminado de 100,000
    TarjetadeCredito(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    // Método para establecer un nuevo saldo en la tarjeta
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    // Método para obtener el saldo actual de la tarjeta
    public int getAmount() {
        return amount;
    }

}
