
package e81sinDIP;

public class Principal {

    public static void main(String[] args) {
        DataService databaseService = new DataService();
        AccesoADatos objeto = new AccesoADatos(databaseService);
        Dato dato2 = new Dato();
        dato2 = objeto.getDatos();
    }
    
}
