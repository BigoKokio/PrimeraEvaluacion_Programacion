package PROG.ArraysPROG.EjArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class EjA2_5 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la
        forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
        */
        char[] A = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] B = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] C = new char[20];
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) {
                C[i] = A[i/2];
            } else {
                C[i] = B[i/2];
            }
        }
        System.out.println(Arrays.toString(C));
    }
}
