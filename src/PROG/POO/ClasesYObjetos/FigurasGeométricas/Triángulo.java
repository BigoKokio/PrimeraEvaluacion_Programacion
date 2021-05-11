package Programación.POO.ClasesYObjetos.FigurasGeométricas;

import java.util.ArrayList;

public class Triángulo extends Figura2D {
    Punto P1;
    Punto P2;
    Punto P3;

    // Constructor 1: le llegan 3 puntos
    public Triángulo(Punto P1, Punto P2, Punto P3) {
        super(3); // llamada al constructor de la superclase con los parámetros dados
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
    }

    // Constructor 2: recibe un arraylist de puntos e imicializa los atributos
    public Triángulo(ArrayList<Punto> puntos) {
        super(3); // llamada al constructor de la superclase con los parámetros dados
        this.P1 = puntos.get(0);
        this.P2 = puntos.get(1);
        this.P3 = puntos.get(2);
    }

    @Override
    public String toString() {
        return "Triángulo{" +
                "P1=" + P1 +
                ", P2=" + P2 +
                ", P3=" + P3 +
                '}';
    }

    @Override
    ArrayList<Línea> crearLíneas() {
        return null;
    }

    @Override
    double calcularPerímetro() {
        return 0;
    }

    @Override
    double calcularÁrea() {
        return 0;
    }
}
