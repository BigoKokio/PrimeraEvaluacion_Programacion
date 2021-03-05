package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        /*
        Realizar un programa que, dada una cadena de caracteres, genere otra cadena resultado de invertir
        la primera.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena:");
        String cadena = sc.nextLine();
        String inversa = ""; /* partimos de una cadena vacía
        recorremos al revés la cadena y vamos añadiendo caracteres a la cadena
        inversa */
        for (int i = cadena.length()-1; i >= 0; i--) {
            inversa = inversa + cadena.charAt(i);
        }
        System.out.println("Cadena invertida: " + inversa);
    }
}
