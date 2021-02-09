package Programación.EjerciciosArray2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a
        continuación los elementos impares. Realizar dos versiones: una trabajando con los valores
        y otra trabajando con los índices.
        */
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        int[] array2 = new int[10];
        int pos2 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[pos2] = array1[i];
                pos2++;
            }
        }
        System.out.println("Array 2: (Nº pares de Array 1) " + Arrays.toString(array2));
        System.out.println("Última posición: " + pos2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array2[pos2] = array1[i];
                pos2++;
            }
        }
        System.out.println("==================");
        System.out.println("Array 2: (Nº pares y Nº impares de Array 1) " + Arrays.toString(array2));
        System.out.println("Última posición: " + pos2);
        int[] array3 = new int[10];
        int pos3 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 0) {
                array3[pos3] = i;
                pos3++;
            }
        }
        System.out.println("Última posición: " + pos3);
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 1) {
                array3[pos3] = i;
                pos3++;
            }
        }
        System.out.println("Array 3: " + Arrays.toString(array3));
    }
}
