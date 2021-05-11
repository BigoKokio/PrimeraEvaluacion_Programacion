package PROG.ArraysPROG.EjArrays1;

import java.util.Scanner;

public class EjA1_3 {
    public static void main(String[] args) {
        /*
        Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
        (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la
        nota más alta que ha sacado y la menor.
        */
        Scanner sc = new Scanner (System.in);
        double sumaMedia = 0;
        double media = 0;
        double notaMayor = 0;
        double notaMenor = 10;
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
        }
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%.2f ", notas[i]);
        }
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            sumaMedia = sumaMedia + notas[i];
        }
        media = sumaMedia / 5;
        System.out.printf("Media: %.2f ", media);
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
        }
        System.out.printf("Nota mayor: %.2f ", notaMayor);
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        System.out.printf("Nota menor: %.2f ", notaMenor);
    }
}
