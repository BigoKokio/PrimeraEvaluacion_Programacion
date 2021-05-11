package PROG.POO.ClasesYObjetos.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    // Crear una clase denominada Biblioteca, que cumpla las siguientes características:
    //•	Pertenecer al paquete biblioteca.
    //•	Tener un atributo denominado listaLibros que contendrá un array de objetos Libro representando los libros de la biblioteca.
    ArrayList<Libro> listaLibros = new ArrayList<>();
    ArrayList<Socio> listaSocios = new ArrayList<>();

    //• Tener un constructor que recibe como parámetro la lista de libros inicial de la biblioteca.
    public Biblioteca(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    //Modificar la clase Biblioteca para incluir un método público
    //denominado estaPrestado. Dicho método recibirá como parámetro un
    //identificador de libro, y devolverá true si el libro se encuentra prestado, o false si
    //el libro no se encuentra prestado o no pertenece a la biblioteca. Para buscar el libro
    //se utilizará el método busquedaBinaria del apartado anterior.
    public boolean estáPrestado(int identificador) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (identificador == listaLibros.get(i).identificador) {
                return true;
            }
        }
        return false;
    }

    //Crea un método imprimirFicha, que recibe por parámetro un identificador de un libro y muestra por pantalla las características del libro de manera similar a la tabla anterior.
    public void imprimirBiblioteca() {
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.println(listaLibros.get(i).toString());
        }
    }
}
