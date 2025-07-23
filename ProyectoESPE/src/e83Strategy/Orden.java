package e83Strategy;

/*
Clase orden.
Esta clase no conoce la estrategia de pago concreta que el usuario ha elegido.
En su lugar, delega la recolección de datos y el proceso de pago a un objeto que implementa la interfaz EstrategiaAPagar.
También puede utilizarse para guardar la orden en una base de datos.
 */
public class Orden {

    //atributos
    private int totalCost = 0;
    private boolean isClosed = false;

    // Método que procesa la orden utilizando la estrategia de pago recibida
    public void processOrder(EstrategiaAPagar strategy) {
        strategy.collectPaymentDetails();
        // Aquí podríamos recolectar y guardar los datos de pago desde la estrategia
    }

    // Método para establecer (sumar) el costo total de la orden
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    // Método que devuelve el costo total de la orden
    public int getTotalCost() {
        return totalCost;
    }

    // Método que indica si la orden está cerrada (true) o no (false)
    public boolean isClosed() {
        return isClosed;
    }
    
    // Método que marca la orden como cerrada
    public void setClosed() {
        isClosed = true;
    }
}
