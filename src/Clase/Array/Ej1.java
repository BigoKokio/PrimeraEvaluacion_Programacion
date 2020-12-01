package Clase.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Elemento:   Cuadrado:   Cubo: ");
        System.out.println("==========================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t\t\t" + (array[i] * array[i]) + "\t\t\t" + (array[i] * array[i] * array[i]));

        }
    }
}
