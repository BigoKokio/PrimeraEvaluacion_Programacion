package Clase.Sesión6;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        float base = sc.nextFloat();
        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();
        int cont1 = 1;
        float cont2 = 1;
        for (int i = 0; i < exponente; i++) {
            System.out.println(cont1);
            cont1 = cont1 + 1;
            cont2 = cont2 * base;
        }
        System.out.println(cont2);
    }
}
