package PROG.InterfacesPROG.EdiciónGráfica;

public interface Herramientas {

    public enum grosor { FINO, MEDIO, GRUESO};
    void dibujar(Curva curva);
    void sombrear();
    void barnizar();

    static int contarObjetos() {
        int contador = 0;
        return contador;
    }
/*
    private int privado() {
        System.out.println("Soy privado.");
        return 0;
    }

    default void getPrivado() {
        privado();
    }
*/
}
