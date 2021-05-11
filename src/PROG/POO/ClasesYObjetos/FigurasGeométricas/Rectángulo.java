package Programación.POO.ClasesYObjetos.FigurasGeométricas;

import java.util.ArrayList;

public class Rectángulo extends Figura2D {
    public Rectángulo() {
        super(4); // llamada al constructor de la superclase con los parámetros dados
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
