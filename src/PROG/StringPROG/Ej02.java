package Programación.StringPROG;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        /*
        Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena
        introducida por teclado.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce subcadena: ");
        String subcadena = sc.nextLine();
        // Comprueba si cadena comienca por subcadena: método startsWith:
        boolean comprueba = cadena.startsWith(subcadena);
        if (comprueba) System.out.println("Cierto");
        else System.out.println("Falso");
    }
}
