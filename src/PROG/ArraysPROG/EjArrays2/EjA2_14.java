package PROG.ArraysPROG.EjArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class EjA2_14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar)
        las dos tablas en una tercera, de forma que sigan ordenados.
        */
        int[] ArrayA = new int[10];
        int[] ArrayB = new int[10];
        for (int i = 0; i < ArrayA.length; i++) {
            ArrayA[i] = (int) (Math.random() * 1000);
            ArrayB[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(ArrayA);
        Arrays.sort(ArrayB);
        System.out.println("ArrayA: " + Arrays.toString(ArrayA));
        System.out.println("ArrayB: " + Arrays.toString(ArrayB));
        int[] ArrayC = new int[20];
        int posA = 0;
        int posB = 0;
        int posC = 0;
        int minC = 100000000;
        while (posC < 20) {
            ArrayC[posC] = ArrayA[posA];
            posC++;
            ArrayC[posC] = ArrayB[posB];
            posC++;
            posA++;
            posB++;;
        }
        //System.out.println(posA);
        //System.out.println(posB);
        //System.out.println(posC);
        System.out.println(Arrays.toString(ArrayC));
    }
}
