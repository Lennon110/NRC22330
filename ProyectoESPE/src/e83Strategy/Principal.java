package e83Strategy;

//liberias
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Clase principal.
Simula un sistema de compras y pagos usando el patrón Strategy
El usuario selecciona productos y elige un método de pago (PayPal o tarjeta de crédito)
La clase delega la recolección de datos de pago y el procesamiento del pago a una estrategia
 */
public class Principal {

    //atributos
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Orden order = new Orden();
    private static EstrategiaAPagar strategy;

    // Bloque estático para inicializar los productos y sus precios
    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);

    }

    public static void main(String[] args) throws IOException {
        // Bucle principal que se ejecuta mientras la orden no esté cerrada
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            // Bucle do-while para seleccionar productos y agregar al total
            do {
                System.out.print("Por favor selecciona un producto" + "\n"
                        + "1 - Motherboard" + "\n"
                        + "2 - CPU" + "\n"
                        + "3 - HDD" + "\n"
                        + "4 - Memoria" + "\n"
                );
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Cantidad: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Deseas continuar seleccionando productos? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            //Se solicita al usuario que elija una estrategia de pago
            if (strategy == null) {
                System.out.println("Seleccion el metodo de pago: " + "\n"
                        + "1 - PayPal" + "\n"
                        + "2 - Tarjeta de credito"
                );
                String paymentMethod = reader.readLine();

                //El cliente crea la estrategia correspondiente según la entrada del usuario
                if (paymentMethod.equals("1")) {
                    strategy = new PagarconPayPal();
                } else {
                    strategy = new PagarconTarjetadeCredito();

                }
            }

            // La orden delega la recolección de datos de pago al objeto estrategia
            order.processOrder(strategy);

            System.out.print("Pagar " + order.getTotalCost() + " unidades o Continuar comprando? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finalmente, la estrategia maneja el proceso de pago
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("El pago se ha realizado correctamente.");
                } else {
                    System.out.println("FALLO! Por favor, revise sus datos");
                }
                order.setClosed(); //Cerrrar la orden
            }
        }
    }
}
