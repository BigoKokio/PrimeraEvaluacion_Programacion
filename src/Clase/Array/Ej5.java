package Clase.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double[] numeros = new double[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * 10;
        }
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {

        }
    }
}
