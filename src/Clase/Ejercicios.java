package Clase;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");
        int a1 = sc.nextInt();
        if (a1 >= 0) {
            int mult = 0;
            int cont = 0;
           for (int i = 1; i <= 10; i++) {
                cont = cont + 1;
                mult = a1 * cont;
                System.out.println("Tabla del " + a1 + " : " + a1 + " * " + i + " = " + mult);
            }
        } else {
            System.out.println("El número debe ser positivo");
        }

    }
}