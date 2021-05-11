package PROG.ArraysPROG.EjArrays2;

import java.util.Scanner;

public class EjA2_4 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
        último, el segundo, el penúltimo, el tercero, etc.
        */
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < (a.length) / 2; i++) {
            System.out.print(a[i] + " " + a[(a.length - 1) - i] + " ");
        }
    }
}
