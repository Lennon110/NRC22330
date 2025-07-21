package e83Strategy;

public class TarjetadeCredito {

    private int amount;
    private String number;
    private String date;
    private String cvv;

    TarjetadeCredito(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }    
}
