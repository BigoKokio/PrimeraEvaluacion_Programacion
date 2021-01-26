package Programación.POO.ClasesYObjetos;

public class EjClasesYObjetos {
    String nombre;
    int edad;
    int altura;
    String[] sintomas = new String[3];

    public EjClasesYObjetos(String nombre, int edad, int altura, String[] sintomas) { // Constructor del objeto "h" de EjClasesYObjetos
        this.nombre = nombre; // "this" es una referencia al objeto que creas con el constructor, por lo que: "this" = "p/j/h"
        this.edad = edad;
        this.altura = altura;
        this.sintomas = sintomas;
    }

    // Ejemplo de sobrecarga de métodos = constructores múltiples
    public EjClasesYObjetos() {
        this.nombre = "Desconocido";
    }
}
