package Clase.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = new String[5];
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Introduce una cadena de texto: ");
            cadenas[i] = sc.next();
        }
        String[] inverso = new String[5];
        for (int i = 0; i < inverso.length; i++) {
            inverso[4 - i] = cadenas[i];
        }
        System.out.println(Arrays.toString(inverso));
    }
}