package Programación.POO.ClasesYObjetos.Ejército;

public class Caballería {
    // Atributos
    String nombreCaballería;
    static int contadorCaballería;
    // Constructor
    public Caballería(String nombreCaballería) {
        this.nombreCaballería = nombreCaballería;
        contadorCaballería++;
    }
}
