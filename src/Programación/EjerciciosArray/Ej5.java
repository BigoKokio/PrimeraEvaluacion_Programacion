package Programación.EjerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y
        posterior ordene los elementos de menor a mayor.
         */
        Scanner sc = new Scanner (System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
        System.out.println();
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
