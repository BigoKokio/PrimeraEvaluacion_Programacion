package PrácticasEntornos;

/**
 * Define la clase "Persona" con sus atributos "Nombre", "Edad" y "Altura"
 * @version 1.1, 13/01/21
 * @author Sergio Murias
 * @since 1.0, 12/01/21
 * En Wikipedia se define "persona" como <em>un concepto principalmente filosófico</em>
 */

public class Persona {

    /** El nombre de la persona debe empezar por una letra mayúscula */
    private String nombre;
    /** La edad debe ser mayor que cero */
    private int edad;
    /** La altura debe estar representada en centímetros */
    private int altura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, int altura) {
        this(nombre,edad);
        this.altura = altura;
    }

}