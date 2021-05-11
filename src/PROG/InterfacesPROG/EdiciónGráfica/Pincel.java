package PROG.InterfacesPROG.EdiciónGráfica;

public class Pincel implements Herramientas{
    public void dibujar(Curva curva) {
        System.out.println("Soy un pincel y dibujo una curva.");
    }

    @Override
    public void sombrear() {
        System.out.println("Soy un lápiz y sombreo");
    }

    @Override
    public void barnizar() {

    }
}