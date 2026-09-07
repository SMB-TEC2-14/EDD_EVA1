/*
Santiago Morquecho Bañuelos #24550835
03/09/2026
 */
package eva1_2_stack;
public class EVA1_2_STACK {

    public static void main(String[] args) {
        System.out.println("INICIA main");
        A();
        System.out.println("TERMINA main");
    }
    public static void A(){
        System.out.println("INCIA A()");
        B();
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICIA B()");
        int i = 5;
        double d = 5.5; 
        System.out.println("TERMINA A()");
    }
}
