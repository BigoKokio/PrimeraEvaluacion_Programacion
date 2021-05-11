package Programación.POO;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(signo(n));
    }
    public static int signo(int número) {
        if (número > 0) {
            return 1;
        } else if (número < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}