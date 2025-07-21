package e82conDIP;

public class AccesoADatos {

    private Conexion conexion;

    public AccesoADatos(Conexion conexion) {
        this.conexion = conexion;
    }

    Dato getDatos() {
        conexion.getDatos();
        return null;
    }
}

