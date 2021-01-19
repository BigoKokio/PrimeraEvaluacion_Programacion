package sesion03;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres números, uno a uno: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean prueba = n1 != n2 && n1 != n3 && n2 != n3;

        System.out.println(prueba);
    }
}
