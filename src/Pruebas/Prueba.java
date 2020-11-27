package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int[] array = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};
        for (int elem : array) {
            if (elem == 'a') {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " letras 'a' en el array");
    }
}




