package PROG.InterfacesPROG.Batalla;

public class Humano extends Físico implements Espiritual{
    double inteligencia; // 0..1000
    double fe; // 0..100
    double bondad; // 0..100
    double alma; // 0..1000

    @Override
    public boolean rezar() {
        return false;
    }

    Humano() {
        inteligencia = Math.random() * 1000;
        fe = Math.random() * 100;
        bondad = Math.random() * 100;
        alma = Math.random() * 1000;
    }

    void conflictoMoral(Ángel a, Demonio d) {

    }

    double golpear(Incorpóreo s, int habilidad) {
        return 0;
    }

    @Override
    public String toString() {
        // CHAPUZA; REVISAR
        String c = "Humano{ + inteligencia= %.2f" + inteligencia;

        String cadena = c +
                ", fe=" + fe +
                ", bondad=" + bondad +
                ", alma=" + alma +
                '}';
        return cadena;
    }
}