package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        /*
        Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se
        introducen por teclado.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Subcadena: ");
        String subcadena = sc.nextLine();
        // para hacer la comparación pasamos subcadena y cadena a minúsculas
        int resultado = cadena.toLowerCase().indexOf(subcadena.toLowerCase());
        if (resultado >= 0)
            System.out.println(cadena + " contiene " + subcadena);
        else
            System.out.println(cadena + " no contiene " + subcadena);
    }
}

