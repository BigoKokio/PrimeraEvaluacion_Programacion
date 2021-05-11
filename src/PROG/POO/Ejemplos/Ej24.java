package Programación.POO;

import java.util.*;

public class Ej24 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Tamaño del array: ");
            n = sc.nextInt();
        } while (n <= 0);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        System.out.println(Arrays.toString(array));
        getPrimeroYUltimo(array);
    }
    public static int[] getPrimeroYUltimo(int[] enteros) {
        int[] respuesta = new int[2];
        respuesta[0] = enteros[0];
        respuesta[1] = enteros[enteros.length - 1];
        System.out.println(Arrays.toString(respuesta));
        return respuesta;
    }
}