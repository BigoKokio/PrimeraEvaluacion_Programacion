package Programación.EjerciciosForPDF;

import java.util.Scanner;

public class Ej12_Pag45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        for (int i = numero; i > 0; i--) {
            //System.out.println(i);
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
