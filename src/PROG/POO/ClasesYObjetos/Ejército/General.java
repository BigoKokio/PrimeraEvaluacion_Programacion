package Programación.POO.ClasesYObjetos.Ejército;

public class General {
    // Atributos
    String nombreGeneral;
    static int contadorGenerales;
    // Constructor
    public General(String nombreGeneral) {
        this.nombreGeneral = nombreGeneral;
        contadorGenerales++;
    }
}
