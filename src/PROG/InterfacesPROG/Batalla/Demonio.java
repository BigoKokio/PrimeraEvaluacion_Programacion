package PROG.InterfacesPROG.Batalla;

public class Demonio extends Incorpóreo implements Espiritual{
    // fe 0..1000
    // maldad 0..1000
    // bondad 0..10

    @Override
    public boolean rezar() {
        return false;
    }

    Demonio() {
        fe = Math.random() * 1000;
        maldad = Math.random() * 1000;
        bondad = Math.random() * 10;
    }

    @Override
    public String toString() {
        return "Demonio{" +
                "fe=" + fe +
                ", maldad=" + maldad +
                ", bondad=" + bondad +
                '}';
    }
}
