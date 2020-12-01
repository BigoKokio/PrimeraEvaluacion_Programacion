package Clase.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int[] lista3 = new int[10];
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = (int) (Math.random() * 10 + 1);
            lista2[i] = (int) (Math.random() * 10 + 1);
            lista3[i] = lista1[i] + lista2[i];
        }
        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));
    }
}
