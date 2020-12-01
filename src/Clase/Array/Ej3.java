package Clase.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
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
        System.out.println("Media: ");
        for (int i = 0; i < notas.length; i++) {
            sumaMedia = sumaMedia + notas[i];
        }
        media = sumaMedia / 5;
        System.out.println(media);
        System.out.println("Nota mas alta: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
        }
        System.out.println(notaMayor);
        System.out.println("Nota mas alta: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        System.out.println(notaMenor);
    }
}
