package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre y apellidos: ");
        String cadena = sc.nextLine();
        // quitamos espacios al principio y al final
        cadena = cadena.trim();
        /* el truco está en mostrar:
        - el primer carácter de la cadena será la inicial del nombre
        - después recorremos el array, cada vez que llegamos a un espacio,
        mostramos el carácter de la siguiente posición
        */
        System.out.print(cadena.charAt(0));
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 32) {
                System.out.print(cadena.charAt(i+1));
            }
        }
    }
}
