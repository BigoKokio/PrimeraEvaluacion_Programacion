package Programación.POO;

import java.util.*;

public class Ej23 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Tamaño del array: ");
            n = sc.nextInt();
        } while (n <= 0);
        long[] numeros = new long[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (long) (Math.random() * 100 - 50);
        }
        System.out.println("Introduce el índice: ");
        int indice = sc.nextInt();
        System.out.println("Introduce el valor: ");
        long valor = sc.nextLong();
        System.out.println(" ");
        System.out.println("Antes:");
        System.out.println(Arrays.toString(numeros));
        sumarValorPorÍndice(numeros, indice, valor);
    }
    public static void sumarValorPorÍndice(long[] array, int indice, long valor) {
        array[indice] =  array[indice] + valor;
        System.out.println("Después:");
        System.out.println(Arrays.toString(array));
    }
}
