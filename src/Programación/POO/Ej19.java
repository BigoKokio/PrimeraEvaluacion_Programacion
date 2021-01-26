package Programación.POO;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el argumento String: ");
        String str = sc.nextLine();
        System.out.println("Introduce el argumento int: ");
        int n = sc.nextInt();
        print(str);
        print(str, n);
    }
    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }
    public static void print(String strArg, int n) {
        System.out.println("print(\"" + strArg + "\", " + n + ")");
    }
}