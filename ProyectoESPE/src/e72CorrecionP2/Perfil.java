package e72CorrecionP2;

public class Perfil {
    private int numeroPerfil;
    private String descripcion;

    public Perfil(int numeroPerfil, String descripcion) {
        this.numeroPerfil = numeroPerfil;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Perfil{" + "numeroPerfil=" + getNumeroPerfil() + ", descripcion=" + getDescripcion() + '}';
    }

    /**
     * @return the numeroPerfil
     */
    public int getNumeroPerfil() {
        return numeroPerfil;
    }

    /**
     * @param numeroPerfil the numeroPerfil to set
     */
    public void setNumeroPerfil(int numeroPerfil) {
        this.numeroPerfil = numeroPerfil;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
