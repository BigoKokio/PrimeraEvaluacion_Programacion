package Programación.EjerciciosSesión6;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int a = sc.nextInt();
        System.out.println("Introduce otro número mayor que el primero: ");
        int b = sc.nextInt();
        if (a < b) {
            int cont = 0;
            int suma = 0;
            for (int i = a; i <= b; i++) {
                //System.out.println(i);
                cont = cont + 1;
                suma = suma + cont;
            }
            System.out.println(suma);
        } else {
            System.out.println("El segundo número debe ser mayor que el segundo");
        }
    }
}
