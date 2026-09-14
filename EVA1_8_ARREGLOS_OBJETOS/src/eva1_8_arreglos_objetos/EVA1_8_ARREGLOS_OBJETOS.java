/*
Santiago Morquecho Bañuelos #24550835
11/09/2026
 */
package eva1_8_arreglos_objetos;
public class EVA1_8_ARREGLOS_OBJETOS {

    public static void main(String[] args) {
        Ejemplo[] arreglo = null;//Variable no inicializada debe usar null;
        //System.out.println("Arreglo = " + arreglo);
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo = " + arreglo);
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        
        System.out.println("arreglo[0] = " + arreglo[0].i);
        System.out.println("arreglo[0] = " + arreglo[1].i);
    }
    
}
class Ejemplo{
    int i = 5;
}
