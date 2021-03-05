package sesion03;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        boolean menorQue10yMayorQue0 = n < 10 && n > 0;
        System.out.println(menorQue10yMayorQue0);
    }
}
