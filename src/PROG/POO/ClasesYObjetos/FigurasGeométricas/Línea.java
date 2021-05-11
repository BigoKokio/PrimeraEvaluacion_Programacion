package Programación.POO.ClasesYObjetos.FigurasGeométricas;

public class Línea {
    final int DIMENSIONES = 2;
    Punto puntoInicio;
    Punto puntoFinal;

    public Línea(Punto puntoInicio, Punto puntoFinal) {
        this.puntoInicio = puntoInicio;
        this.puntoFinal = puntoFinal;
    }

    public double calcularLongitud() {
        return Math.sqrt(Math.pow(puntoFinal.X - puntoInicio.X, 2) + Math.pow(puntoFinal.Y - puntoInicio.Y, 2));
    }

    @Override
    public String toString() {
        return "Línea{" +
                "puntoInicio=" + puntoInicio +
                ", puntoFinal=" + puntoFinal +
                '}' + "Longitud = " + calcularLongitud();
    }

    public void dibujarLínea() {
        int longitudINT = (int) Math.round(calcularLongitud()); // pasar de double a int
        for (int i = 0; i < longitudINT; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
