package Programación.POO.ClasesYObjetos.Ejército;

public class Médico {
    // Atributos
    String nombreMédico;
    static int contadorMédicos;
    // Constructor
    public Médico(String nombreMédico) {
        this.nombreMédico = nombreMédico;
        contadorMédicos++;
    }
}
