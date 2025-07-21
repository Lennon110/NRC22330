package e83Strategy;

import java.io.*;
import java.util.*;

public class Principal {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Orden order = new Orden();
    private static EstrategiaAPagar strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);

    }

    public static void main(String[] args) {
        while(!order.isClosed()){
            int cost;
            
            String continueChoice;
            do {
                System.out.println("Por favor selecciona un producto" + "\n" +
                        "1 - Mother board" + "\n"+
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memoria" + "\n"
                );
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("contar: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("Deseas continuar seleccionando productos? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));
            
            if (strategy == null)
        }
    }

}
