package sesion03;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        boolean menorQue10 = n < 10;
        System.out.println(menorQue10);
    }
}
