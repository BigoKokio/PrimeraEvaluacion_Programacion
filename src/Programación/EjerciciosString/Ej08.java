package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena: ");
        String cadena = sc.nextLine();
        /* para saber si un carácter de la cadena está en mayúsculas o minúsculas
        utilizamos el método isUpperCase de la clase Character */
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                System.out.print(Character.toLowerCase(cadena.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(cadena.charAt(i)));
            }
        }
    }
}
