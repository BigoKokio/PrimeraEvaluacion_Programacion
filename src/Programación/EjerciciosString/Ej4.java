package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena: ");
        String cadena = sc.nextLine();
        /* el truco está en contar los espacios; cada vez que llegamos a un espacio
        tenemos una palabra */
        cadena = cadena.trim(); // por si hubiera espacios antes o después, los quitamos
        int contador = 0; // añadirá 1 por cada espacio
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 32) {
                /* 32 es el valor decimal para el espacio
                en blanco en la tabla ascii */
                contador++;
            }
        }
        System.out.println("La cadena \"" + cadena + " contiene " + (contador + 1) + " \"palabras");
        /* añadimos 1 para contar también la última palabra, que
        no termina con un espacio */
    }
}
