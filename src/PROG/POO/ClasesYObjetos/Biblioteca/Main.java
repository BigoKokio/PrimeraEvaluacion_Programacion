package PROG.POO.ClasesYObjetos.Biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("2666", "Roberto Bolaño", Libro.Género.NOVELA);
        Libro l2 = new Libro("El infinito en un junco", "Irene Vallejo", Libro.Género.POESÍA);
        Libro l3 = new Libro("Cálculo de estructuras", "Joan Margarit");
        Libro l4 = new Libro("Orgullo y prejuicio" , "Jane Austen", Libro.Género.NOVELA);
        /*System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        System.out.println(l4.toString());*/

        System.out.println("Libros creados: " + Libro.contador);
        
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        libros.add(l4);
        Biblioteca biblioteca = new Biblioteca(libros);
        biblioteca.imprimirBiblioteca();
        
        darDeAltaSocio(biblioteca, "Juana", "Calle Pez 2", "1234567");
        darDeAltaSocio(biblioteca, "Juan", "Calle  Paz 2", "6543210");

        System.out.println("1");
        prestarLibro(biblioteca, "Juana", l1.identificador);
        System.out.println("2");
        prestarLibro(biblioteca, "Juan", l1.identificador);
        System.out.println("3");
        prestarLibro(biblioteca, "Juan", l2.identificador);
        System.out.println("4");
        prestarLibro(biblioteca, "Pepe", 5);
    }

    public static void darDeAltaSocio(Biblioteca b, String nombre, String dirección, String teléfono) {
        Socio s = new Socio(nombre, dirección, teléfono);
        b.listaSocios.add(s);
        System.out.println("Socio: " + s.getNombre());

    }

    public static void prestarLibro(Biblioteca b, String nombre, int idLibro) {
        boolean faltanDatos = true;
        for (int i = 0; i < b.listaLibros.size(); i++){
            if (b.listaLibros.get(i).identificador == idLibro) {
                    if (b.listaLibros.get(i).isPrestado()) {
                        faltanDatos = false;
                        System.out.println("El libro " + b.listaLibros.get(i).getTítulo() + " se encuentra en préstamo");
                        break;
                    } else {
                        b.listaLibros.get(i).setPrestado(true);
                        // buscamos al socio para mostrar su nombre
                        for (int j = 0; i < b.listaSocios.size(); i++) {
                            if (b.listaSocios.get(i).getNombre() == nombre) {
                                b.listaLibros.get(i).setPrestado(true);
                                System.out.println("Se ha prestado el libro" + b.listaLibros.get(i).getTítulo() + " a " + b.listaSocios.get(i).getNombre());
                                faltanDatos = false;
                            }
                        }
                    }
            }
        }
        if (faltanDatos = true) System.out.println("Revisar datos");
    }
}
