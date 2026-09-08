/*
Santiago Morquecho Bañuelos #24550835
07/09/2026
 */
package eva_5_paso_parametros;
public class EVA_5_PASO_PARAMETROS {

    public static void main(String[] args) {
        //PASO POR VALOR
        int i = 5;
        System.out.println("Valor de i = " + i);
        incrementar(i);
        System.out.println("Valor de i (despues de incrementar) = " + i);
        //AHORA PASO POR REFERENCIA
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y =" + prueba.y);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (desuoues de incrementar) = " + prueba.y );
    }
    public static void incrementar(int valor){//PASO POR VALOR (RECIBO UNA COPIA)
        valor++;
    }
    public static void incrementarObj(Prueba  objeto){
        objeto.y++;
    }
}

class Prueba{
    int y = 5;
}
