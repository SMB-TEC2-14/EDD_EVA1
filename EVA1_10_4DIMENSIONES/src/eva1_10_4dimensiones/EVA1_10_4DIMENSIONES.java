/*
Santiago Morquecho Bañuelos #24550835
14/09/2026
 */
package eva1_10_4dimensiones;
public class EVA1_10_4DIMENSIONES {

    public static void main(String[] args) {
        int[][][][] arreglo = new int [2][2][2][2];//ALMACENA 16 ENTEROS
        for (int i = 0; i < arreglo.length; i++) {//1ER DIMENSION
            for (int j = 0; j < arreglo[i].length; j++) {//2DA DIMENSION
                for (int k = 0; k < arreglo[i][j].length; k++) {//3RA DIMENSION
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {//4TA DIMENSION
                        arreglo[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {//1ER DIMENSION
            for (int j = 0; j < arreglo[i].length; j++) {//2DA DIMENSION
                for (int k = 0; k < arreglo[i][j].length; k++) {//3RA DIMENSION
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {//4TA DIMENSION
                        System.out.print("[" + arreglo[i][j][k][l] + "]");
                    }
                }
            }
        }
    }
    
}
