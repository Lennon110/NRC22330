package e72CorrecionP2;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private ArrayList<Perfil> perfiles;
    private ArrayList<LugarFrecuente> lugaresFrecuentes;
    private Foto foto;

    public Persona(String nombre, String apellido, ArrayList<Perfil> perfiles, ArrayList<LugarFrecuente> lugaresFrecuentes, Foto foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perfiles = perfiles;
        this.lugaresFrecuentes = lugaresFrecuentes;
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + 
                "\nApellido: " + getApellido() + 
                "\nPerfiles: " + getPerfiles() + 
                "\nLugares Frecuentes:" + getLugaresFrecuentes() + 
                "\nDatos foto: \n" + getFoto();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the perfiles
     */
    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    /**
     * @param perfiles the perfiles to set
     */
    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    /**
     * @return the lugaresFrecuentes
     */
    public ArrayList<LugarFrecuente> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    /**
     * @param lugaresFrecuentes the lugaresFrecuentes to set
     */
    public void setLugaresFrecuentes(ArrayList<LugarFrecuente> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    /**
     * @return the foto
     */
    public Foto getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Foto foto) {
        this.foto = foto;
    }

}
