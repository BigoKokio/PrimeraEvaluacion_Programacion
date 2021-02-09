package Programación;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prueba {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int posAleatoria = r.nextInt(array.length);
            int temp = array[i];
            array[i] = array[posAleatoria];
            array[posAleatoria] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}




