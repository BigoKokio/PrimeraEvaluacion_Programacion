package Clase.Sesión6;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int fact = 1;
        for (int a = sc.nextInt(); a >= 1; a--) {
            System.out.println(a);
            fact = fact * a;
        }
        System.out.println(fact);
    }
}
