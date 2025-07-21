package e81sinDIP;

public class AccesoADatos {

    private DataService dataService;

    public AccesoADatos(DataService dataService) {
        this.dataService = dataService;
    }
    
    
    public Dato getDatos() {
        Dato dato = new Dato();
        dataService.getDatos();  
        return dato; 
    }
}