package e84Adapter;

/* 
ClasePrincipal
Simula el uso del patrón Adapter para permitir que piezas cuadradas se adapten a agujeros redondos.
*/
public class Principal {
    //metodo principal
    public static void main(String[] args) {
        //variables locales
        AgujeroRedondo agujero = new AgujeroRedondo(5);
        PiezaRedonda piezaRedonda = new PiezaRedonda(5);
        
        if (agujero.encaja(piezaRedonda)) {
            System.out.println("La pieza redonda de radio 5 encaja en el agujero redondo de radio 5");
        }

        PiezaCuadrada piezaCuadradaPeque = new PiezaCuadrada(2);
        PiezaCuadrada piezaCuadradaLarga = new PiezaCuadrada(20);
         // agujero.encaja(piezaCuadradaPeque); // Esto no compila, no es compatible directamente

        // Se usa el adaptador para convertir la pieza cuadrada en una compatible con el agujero redondo
        AdaptorPiezaCuadrada piezaCuadradaPequeAdaptador = new AdaptorPiezaCuadrada(piezaCuadradaPeque);
        AdaptorPiezaCuadrada piezaCuadradaLargaAdaptador = new AdaptorPiezaCuadrada(piezaCuadradaLarga);
        
        // Verificamos si las piezas cuadradas adaptadas encajan en el agujero
        if (agujero.encaja(piezaCuadradaPequeAdaptador)) {
            System.out.println("La pieza cuadrada de ancho 2 encaja en el agujero redondo de radio 5");
        }
        if (!agujero.encaja(piezaCuadradaLargaAdaptador)) {
            System.out.println("La pieza cuadrada de ancho 20 no encaja en el agujero redondo de radio 5");
        }
    }
}