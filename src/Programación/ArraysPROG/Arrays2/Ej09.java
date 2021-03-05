package Programación.EjerciciosArray2;

import java.util.Arrays;

public class Ej09 {
    public static void main(String[] args) {
        /*
        Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace
        una posición hacia abajo (el último pasa a ser el primero).
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        int[] copia = array.clone();
        array[0] = copia[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = copia[i - 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
