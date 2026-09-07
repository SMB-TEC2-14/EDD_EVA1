/*
Santiago Morquecho Bañuelos #24550835
07/09/2026
 */
package eva_4_objetos;
public class EVA_4_OBJETOS {

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //ELIMINAR prueba:
        //Terminar el programa --> garbage collector (libera memoria automaticamente)
        //eliminar "directamente" el objeto:
        prueba = null;
    }
    
}
class Prueba{
    
}
