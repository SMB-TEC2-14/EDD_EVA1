/*
Santiago Morquecho Bañuelos #24550835
31/08/2026
 */
package eva_1_scope;
public class EVA_1_SCOPE {

    public static void main(String[] args) {
        int x = 100; //EXISTE DENTRO DEL BLOQUE main()
        for (int i = 0; i < 10; i++) {//EXISTE SOLO DENTRO DEL FO
            System.out.println("i =" + i);
            x++;//VISIBLE DENTRO DEL FOR
        }
        //La variable i marca error en esta zona dado a que se encuentra fuera del for, y al no estar registrada como variable al inicio de la funcion marca error
        
        System.out.println("Valor final de la i =" + i);//YA NO EXISTE
        System.out.println("Valoe final de la x =" + x);//TODAVIA EXISTE
    }
    
    public static void OtraFuncion(){
        //Al intentar usar una variable fuera del main, esta va a dar error dado a que en este bloque del codigo no existe x como variables, solo existe en el main
        
        System.out.println("Valor de x" + x);//NO EXISTE
    }
}
