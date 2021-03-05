package sesion02;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //lee un valor entero de la entrada estándar
        System.out.println(((n + 1) * n + 2) * n + 3); // imprime el resultado de la expresión indicada
    }
}
