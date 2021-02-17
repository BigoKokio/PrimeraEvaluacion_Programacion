package Programación.POO.ClasesYObjetos.Ejército;

public class Unidad {
    // Atributos
    String nombreUnidad;
    static int contadorUnidades;
    /* Constructor: recibe un nombre de unidad,
    lo asigna a la instancia e incrementa el contador de unidades
     */
    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
        contadorUnidades++;
    }
}
