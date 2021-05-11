package PROG.ArraysPROG.EjArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class EjA2_12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer por teclado una tabla de 10 elementos numéricos enteros y leer una posición (entre
        0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(array));
        int pos;
        do {
            System.out.println("Introduce la posición a eliminar (0-9): ");
            pos = sc.nextInt();
        } while (pos < 0 || pos > 9);
        for (int i = pos; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
