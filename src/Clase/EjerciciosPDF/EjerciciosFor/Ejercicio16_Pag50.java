package Clase.EjerciciosPDF.EjerciciosFor;

import java.util.Scanner;

public class Ejercicio16_Pag50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int número = sc.nextInt();
        int multiplicacion = 0;
        for (int i = 0; i <= 10; i++) {
            multiplicacion = número * i;
            System.out.println(número + " * " + i + " = " + multiplicacion);
        }
    }
}
