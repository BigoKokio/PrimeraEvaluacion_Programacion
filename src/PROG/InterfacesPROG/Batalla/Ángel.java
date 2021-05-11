package PROG.InterfacesPROG.Batalla;

public class Ángel extends Incorpóreo implements Espiritual{
    // fe 0..1000
    // maldad 0..1000
    // bondad 0..10

    @Override
    public boolean rezar() {
        return false;
    }

    Ángel() {
        fe = Math.random() * 1000;
        maldad = Math.random() * 1000;
        bondad = Math.random() * 10;
        System.out.println("Hola, soy un ángel");
        System.out.printf("Bondad: %.2f\n", bondad);
        System.out.println("Maldad: " + maldad);
        System.out.println("Fe: " + fe);
    }
}