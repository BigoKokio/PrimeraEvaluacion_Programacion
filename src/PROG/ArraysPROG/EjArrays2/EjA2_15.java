package PROG.ArraysPROG.EjArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class EjA2_15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe
        mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("¿Qué número quieres buscar?: ");
        int num = sc.nextInt();
        int pos = 0;
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                encontrado = true;
                pos = i;
            }
        }
        if (encontrado == true) {
            System.out.println("El número " + num + " está en la posición " + pos);
        } else {
            System.out.println("El número " + num + " no está en el array");
        }
    }
}
