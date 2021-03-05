package Programación.EjerciciosArray2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        /*
        Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el
        teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
        posición indicada, desplazando los que estén detrás.
        */
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 5) + 5;
        }
        System.out.println(Arrays.toString(array));
        int pos;
        do {
            System.out.println("Introduce posición: ");
            pos = sc.nextInt();
        } while (pos < 0 || pos > array.length - 1);
        System.out.println("Introduce número a insertar: ");
        int num = sc.nextInt();
        for (int i = array.length - 2; i >= pos - 1; i--) {
            array[i + 1] = array[i];
        }
        array[pos - 1] = num;
        System.out.println(Arrays.toString(array));
    }
}
