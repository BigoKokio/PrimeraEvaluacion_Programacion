package Programación.EjerciciosString;

import java.util.Scanner;

public class Ej04 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < (a.length) / 2; i++) {
            System.out.print(a[i] + " " + a[(a.length - 1) - i] + " ");
        }
    }
}
