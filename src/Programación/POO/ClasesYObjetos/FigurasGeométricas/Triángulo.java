package Programación.POO.ClasesYObjetos.FigurasGeométricas;

import java.util.ArrayList;

public class Triángulo extends Figura2D {
    public Triángulo() {
        super(3); // llamada al constructor de la superclase con los parámetros dados
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
