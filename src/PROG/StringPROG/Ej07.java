package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        /*
        Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del
        primer carácter en la cadena por el segundo carácter.
        */
        Scanner sc = new Scanner(System.in);
        // Pide una cadena
        System.out.println("Cadena: ");
        String cadena = sc.nextLine();
        // y dos caracteres por teclado (valida que sea un carácter)
        String teclado;
        do {
            System.out.println("Primer carácter: ");
            teclado = sc.nextLine();
        } while (teclado.length() != 1);
        char c1 = teclado.charAt(0);
        do {
            System.out.println("Segundo carácter: ");
            teclado = sc.nextLine();
        } while (teclado.length() != 1);
        char c2 = teclado.charAt(0);
        // sustituye la aparición del primer carácter en la cadena por el segundo carácter.
                cadena = cadena.replace(c1, c2);
        System.out.println(cadena);
    }
}
