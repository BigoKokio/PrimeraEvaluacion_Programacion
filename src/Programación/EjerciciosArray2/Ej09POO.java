package Programación.EjerciciosArray2;

import java.util.Arrays;

public class Ej09POO {
    public static void main(String[] args) {
        int[] llamada = crearArray();
        System.out.println(Arrays.toString(llamada));
        int[] copiaLlamada = copiarArray(llamada);
        System.out.println(Arrays.toString(copiaLlamada));
        System.out.println(Arrays.toString(desplazarArray(llamada, copiaLlamada)));
    }
    public static int[] crearArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
    public static int[] copiarArray(int[] array) {
        int[] copia = array.clone();
        return copia;
    }
    public static int[] desplazarArray(int[] array, int[] copia) {
        array[0] = copia[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = copia[i - 1];
        }
        return array;
    }
}
