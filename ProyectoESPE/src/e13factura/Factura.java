
package e13factura;

import java.util.Scanner;


public class Factura {
    
    //Atributos
    public char tipoDocumento;
    private String numeroFactura;
    protected Fecha fecha;
    private Empresa empresa;
    private Cliente cliente;
    Producto producto;
    Producto []vector;
    
    //Constructor

    public Factura() {
        this.numeroFactura = "00001";
        this.fecha = new Fecha();
        this.tipoDocumento = 'F';
        this.empresa = new Empresa();
        this.cliente = new Cliente();
        producto = new Producto();
        vector = new Producto[3];
        for (int i = 0; i < 3; i++) {
            producto = new Producto();
            vector[i] = producto;                       
        }
    }
    
    //ingresar datos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS FACTURA");
        System.out.print("Ingrese el numero factura: ");
        setNumeroFactura(sc.nextLine());
        getFecha().ingresarDatos();
        System.out.print("Ingrese el tipo de documentos: ");
        setTipoDocumento(sc.next().charAt(0));
        getEmpresa().ingresarDatos();
        getCliente().ingresarDatos();
        for (int i = 0; i < 3; i++) {
            producto = new Producto();
            producto.ingresarDatos();
            vector[i] = producto;                       
        }
        
    }

    @Override
    public String toString() {
        return "Datos factura".toUpperCase() + "\n\t\t\t\t\tFactura: " + numeroFactura
        +"\n" + fecha + "\t\t\t\tTipo Documento:  " + tipoDocumento;
    }
    
     public void mostrarFactura() {
         System.out.println("\t\t\tDatos factura".toUpperCase() + "\n\t\t\t\t\tFactura: " + numeroFactura
                 +getEmpresa().getNombre()
        +"\n" + fecha + "\t\t\t\tTipo Documento:  " + tipoDocumento);
         
         System.out.println(getEmpresa().mostrarDatos());
         System.out.println(getCliente());
         for (int i = 0; i < 3; i++) {
             System.out.println(vector[i].toString());
        }
    }

    /**
     * @return the tipoDocumento
     */
    public char getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(char tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the numeroFactura
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}

    

