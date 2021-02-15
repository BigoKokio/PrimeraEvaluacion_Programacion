package Programación.POO.ClasesYObjetos;

import java.util.Arrays;

public class Ej2 {
    public static void main(String[] args) {
        int[] array = {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789, 1234567890};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Número a buscar: ");
        int n = sc.nextInt();
        //System.out.println(Arrays.binarySearch(array, n));
        if (Arrays.binarySearch(array, n) >= 0) {
            System.out.println("El número está en la posición " + Arrays.binarySearch(array, n));
        } else {
            System.out.println("El número no está en el array");
        }
    }
}
