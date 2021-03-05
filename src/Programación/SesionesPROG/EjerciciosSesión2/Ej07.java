package sesion02;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuatro números de uno en uno: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        System.out.println("Los números introducidos son: " + n1 + " " + n2 + " " + n3 + " " + n4);
        System.out.println("Los números decrementados son: " + --n1 + " " + --n2 + " " + --n3 + " " + --n4);
    }
}
