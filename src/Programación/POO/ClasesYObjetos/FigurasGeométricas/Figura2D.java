package Programación.POO.ClasesYObjetos.FigurasGeométricas;

import java.util.ArrayList;

abstract class Figura2D {
    int lados;
    final int DIMENSIONES = 2;

    public Figura2D(int lados) {
        this.lados = lados;
    }

    abstract ArrayList<Línea> crearLíneas();

    abstract double calcularPerímetro();

    abstract double calcularÁrea();

}
