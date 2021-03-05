package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        /*
        Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es
        aquella que se lee igual adelante que atrás.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena: ");
        String cadena = sc.nextLine();
        // quitamos posibles espacios en blanco al principio y al final
        cadena = cadena.trim();
        // quitamos los espacios en blanco
        cadena = cadena.replace( " ", "");
        // pasamos a minúsculas
        cadena = cadena.toLowerCase();
        // invertimos la cadena como hicimos en el ejercicio 6
        String inversa = ""; /* partimos de una cadena vacía */
        /* recorremos al revés la cadena y vamos añadiendo caracteres a la
        cadena inversa */
        for (int i = cadena.length()-1; i >= 0; i--) {
            inversa = inversa + cadena.charAt(i);
        }
        if (cadena.equals(inversa))
            System.out.println("Es un palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}
