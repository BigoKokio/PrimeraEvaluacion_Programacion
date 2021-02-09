package Programación.EjerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4For {
    public static void main(String[] args) {
        /*
        Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un
        número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).
        */
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;
        do {
            System.out.printf("Introduce el tamaño del array: ");
            tamaño = sc.nextInt();
        } while ((tamaño < 0) || (tamaño > 10));
        int[] array = new int[tamaño];
        int numero = 0;
        for (int i = 0; i <= tamaño; i++) {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                array[i] = numero;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}