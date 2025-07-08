
package e72CorrecionP2;

public class Foto {
    private String path;
    private String tipoArchivo;
    private double tamanio;
    
    public Foto(String path, String tipoArchivo, double tamanio){
        this.path = path;
        this.tipoArchivo = tipoArchivo;
        this.tamanio = tamanio;
    }
    
    //metodo para mostrar los datos de la foto
    @Override
    public String toString() {
        return "Path: " + getPath() + "\nTipo de archivo:" + getTipoArchivo() + "\nTamanio: " + getTamanio();
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the tipoArchivo
     */
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * @param tipoArchivo the tipoArchivo to set
     */
    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    /**
     * @return the tamanio
     */
    public double getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    
}
