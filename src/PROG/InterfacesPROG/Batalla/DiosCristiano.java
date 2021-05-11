package PROG.InterfacesPROG.Batalla;

public class DiosCristiano extends Dios{
    boolean esBuenHombre(Humano h) {
        return false;
    }

    DiosCristiano(int numAngeles, int numDemonios) {
        super(numAngeles, numDemonios);    }
}