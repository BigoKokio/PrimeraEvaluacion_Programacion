package Programación.EjerciciosSesión6;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (5 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
