package PROG.InterfacesPROG.EdiciónGráfica;

public class App {
    public static void main(String[] args) {
        Herramientas lápiz = new Lápiz();

        Pincel pincel = new Pincel();

        lápiz.dibujar(new Curva());
        pincel.dibujar(new Curva());

        //lápiz.getPrivado();
    }
}