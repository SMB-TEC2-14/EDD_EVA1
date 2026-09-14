/*
Santiago Morquecho Bañuelos #24550835
14/09/2026
 */
package eva1_9_matrices;
public class EVA1_9_MATRICES {

    public static void main(String[] args) {
        int[][] matriz = new int [5][3];
        System.out.println("matriz = " + matriz);
        System.out.println("matriz.length = " + matriz.length);
        System.out.println("matriz[0] = " + matriz[0]);
        System.out.println("matriz[0].length = " + matriz[0].length);
        System.out.println("matriz[1] = " + matriz[1]);
        System.out.println("matriz[1].length = " + matriz[1].length);
        //---------------------------------------
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < matriz.length; i++) {//PRIMER DIMENSION ---- FILAS
            for (int j = 0; j < matriz[i].length; j++) {//SEGUNDA DIMENSION ---- COLUMNAS //EN ESTE CASO LA i ES LA QUE CONTROLA EN QUE FILA SE ENCUETRA
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {//PRIMER DIMENSION ---- FILAS
            for (int j = 0; j < matriz[i].length; j++) {//SEGUNDA DIMENSION ---- COLUMNAS
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" "); 
        }
    }
    
}
