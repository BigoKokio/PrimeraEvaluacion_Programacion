package Programación.POO.ClasesYObjetos.FigurasGeométricas;

public class Punto {
    double X;
    double Y;

    public Punto(double x, double y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "Punto: (" + X + ", " + Y + ")";
    }
}
