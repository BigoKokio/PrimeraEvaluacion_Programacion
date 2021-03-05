package Programación.EjerciciosArray2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos
        los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar
        adecuado para que la tabla continúe ordenada.
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
        }
        //System.out.println(Arrays.toString(array));
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        int pos = 0;
        while (pos < array.length && array[pos] < n) {
            pos++;
        }
        //System.out.println(pos);
        int[] copia = array.clone();
        for (int i = pos; i < array.length - 1; i++) {
            array[i + 1] = copia[i];
        }
        array[pos] = n;
        System.out.println(Arrays.toString(array));
    }
}
