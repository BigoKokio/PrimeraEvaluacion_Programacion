package PROG.POO.ClasesYObjetos.Biblioteca;

// Crear una clase Libro para representar cualquier libro existente en la biblioteca.
public class Libro {

//Tener los siguientes atributos, que no deben ser accesibles por ninguna otra clase:

//titulo: indica el título del libro
    private String título;

//autor: contiene el nombre del autor del libro
    private String autor;

//prestado: indica si el libro actualmente se encuentra prestado o está disponible en la biblioteca.
    private boolean prestado;

/*Tener un atributo visible por todas las clases llamado tipo. Los posibles tipos para un libro estarán definidos como constantes públicas comunes para todos los objetos de la clase, y son los siguientes:
             NOVELA
             ENSAYO
             POESIA
*/
    enum Género {NOVELA, ENSAYO, POESÍA};
    private Género género;

//Tener un atributo visible por cualquier otra clase y común a todos los objetos Libro, denominado contador, que cuente cuántos libros se han creado.
    public static int contador;

//Tener un atributo visible por cualquier otra clase llamado identificador, que es un número único para cada libro. Al crear un libro se le asignará un identificador consecutivo partiendo del número 100 (el primer libro que se cree tendrá el número 100, el siguiente el 101, y así sucesivamente).
    public int identificador;

//Crear los siguientes métodos de la clase Libro:

//Crear un constructor que reciba como parámetros el título, la descripción y el tipo del libro. Al crearse un libro nuevo no se encuentra prestado.
    public Libro(String título, String autor, Género género) {
        this.título = título;
        this.autor = autor;
        this.género = género;
        prestado = false; // puede no ponerse, ya que el valor por defecto si no se indica es false
        contador++;
        identificador = contador + 100;
    }

//Crear un constructor (que será utilizado para los libros de poesía), que utilice el constructor anterior y que sólo reciba el título y la descripción del libro.
    public Libro(String título, String autor) {
        this.título = título;
        this.autor = autor;
        this.género = Género.POESÍA;
        prestado = false; // puede no ponerse, ya que el valor por defecto si no se indica es false
        contador++;
        identificador = contador + 100;
    }


//Crear métodos que devuelvan el valor de los atributos titulo, descripción, y prestado.
    public String getTítulo() { return título;  }
    public String getAutor() {    return autor; }
    public Género getGénero() { return género;  }
    public boolean isPrestado() {   return prestado;    }

//Crear un método que permita modificar el valor del atributo prestado, recibiendo como parámetro el nuevo valor.
    public void setPrestado(boolean prestado) { this.prestado = prestado;   }

    //d)Crea un método imprimirFicha, que recibe por parámetro un identificador de un libro y muestra por pantalla las características del libro de manera similar a la tabla del ejercicio anterior.


    @Override
    public String toString() {
        return "Libro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                ", género=" + género +
                ", identificador=" + identificador +
                '}';
    }
    
    class Ejemplar {
        int numEjemplares;
        
        public Ejemplar(){
            numEjemplares++;
        }
    }
}
