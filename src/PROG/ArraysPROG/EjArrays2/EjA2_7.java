package PROG.ArraysPROG.EjArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class EjA2_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los
        números están ordenados de forma creciente, decreciente, o si están desordenados.
        */
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] B = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] C = {0, 1, 2, 3, 6, 5, 7, 8, 9, 0};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
        int orden = 0; // ascendente 1, descendente -1, desordenado 0
        if (A[0] < A[1]) {
            // si pasa esto o es ascendente o está desordenado
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] < A[i + 1]) {
                    orden = 1;
                    continue;
                } else {
                    orden = 0;
                    break;
                }
            }
        } else {
            // si pasa esto es descendente
            for (int i = 0; i < A.length; i++) {
                if (A[i] > A[i + 1]) {
                    orden = -1;
                    continue;
                } else {
                    orden = 0;
                    break;
                }
            }
        }
        if (orden == 1) {
            System.out.println("Ascendente");
        } else if (orden == -1){
            System.out.println("Descendente");
        } else {
            System.out.println("Desordenado");
        }
    }
}
