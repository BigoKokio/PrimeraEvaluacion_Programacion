package Programación.EjerciciosArray2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("¿Qué número quieres buscar?: ");
        int num = sc.nextInt();
        int pos = 0;
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                encontrado = true;
                pos = i;
            }
        }
        if (encontrado == true) {
            System.out.println("El número " + num + " está en la posición " + pos);
        } else {
            System.out.println("El número " + num + " no está en el array");
        }
    }
}
