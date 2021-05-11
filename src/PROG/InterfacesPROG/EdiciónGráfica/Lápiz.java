package PROG.InterfacesPROG.EdiciónGráfica;

public class Lápiz implements Herramientas{
    public void dibujar(Curva curva) {
        System.out.println("Soy un lápiz y dibujo una curva.");
    }

    @Override
    public void sombrear() {

    }

    @Override
    public void barnizar() {

    }
}