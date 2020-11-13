package Clase.EjerciciosPDF.EjerciciosFor;

import java.util.Scanner;

public class Ejercicio10_Pag44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduce un número: ");
            int numero = sc.nextInt();
            suma = suma + numero;
        }
        System.out.println(suma);
    }
}
