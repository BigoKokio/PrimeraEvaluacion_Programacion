package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] matriz = {{1, 2, 3, 1}, {3, 4, 1, 2}, {4, 4, 1, 0},};
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}




