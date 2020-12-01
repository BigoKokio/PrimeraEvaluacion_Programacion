package Clase.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4While {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tamaño = 0;
        do {
            System.out.printf("Introduce el tamaño del array: ");
            tamaño = sc.nextInt();
        } while ((tamaño < 0) || (tamaño > 10));
        int[] array = new int[tamaño];
        int numero = 0;
        int cont = 0;
        int i = 0;
        while (cont <= tamaño) {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                array[i] = numero;
            } else {
                break;
            }
            cont++;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
