/*
Santiago Morquecho Bañuelos #24550835
10/09/2026
 */
package eva1_7_arreglos_size;
public class EVA1_7_ARREGLOS_SIZE {

    public static void main(String[] args) {
        System.out.println("Bienvenido usuario :D");
        System.out.println("");
        int[] original = new int[10];
        System.out.println("Original: " +original);
        for (int i = 0; i < original.length; i++) { //LLENAR CON DATOS ALEATORIOS
            original[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < original.length; i++) { //IMPRIMIR
            System.out.print("[" + original[i] + "]");
        }
        int[] copia = new int[5];
        for (int i = 0; i < copia.length; i++) {
            copia[i] = original[i];
        }
        
        original = copia;
        
        System.out.println("");
        //CAMBIAR EL TAMAÑO (NO SE PUEDE)
        //original = new int[5];
        System.out.println("Copia: " + original);
        for (int i = 0; i < original.length; i++) {
            System.out.print("[" + original[i] +"]");
        }
        System.out.println("");
        
    }
    
}