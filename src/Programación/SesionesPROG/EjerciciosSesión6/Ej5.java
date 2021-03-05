package Programación.EjerciciosSesión6;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la tabla de multiplicar: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.println(i  + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
