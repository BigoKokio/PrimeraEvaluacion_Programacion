package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Escribir por pantalla cada carácter de una cadena introducida por teclado.
        */
        System.out.println("Introduce una cadena por teclado: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
    }
}
