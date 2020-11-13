package Clase.Sesión6;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("Introduce un caracter: ");
        char car = sc.next().charAt(0);
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.println(car);
            }
        }
    }
}
