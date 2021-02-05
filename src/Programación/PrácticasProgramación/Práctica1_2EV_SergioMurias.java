package Programación.PrácticasProgramación;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Práctica1_2EV_SergioMurias {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] baraja1 = new int[40];
        int[] baraja2 = new int[40];
        int puntos_jugador1 = 0;
        int puntos_jugador2 = 0;
        int empates = 0;
        rellenarBaraja(baraja1);
        rellenarBaraja(baraja2);
        //barajar(rellenarBaraja(baraja1));
        //barajar(rellenarBaraja(baraja2));
        int contJug = 1;
        do {
            System.out.println("");
            System.out.println("Jugada " + contJug);
            System.out.println("========");
            System.out.println("Puntos Jugador 1: " + puntos_jugador1);
            System.out.println("Puntos Jugador 2: " + puntos_jugador2);
            System.out.println("Empates: " + empates);
            contJug++;
        } while (contJug <= 40);
        if (puntos_jugador1 > puntos_jugador2) {
            System.out.println("¡EL JUGADOR 1 HA GANADO LA PARTIDA!");
        } else {
            System.out.println("¡EL JUGADOR 2 HA GANADO LA PARTIDA!");
        }
    }
    public static void rellenarBaraja(int[] array) {
        int[] arrayRB = new int[40];
        int pos = 0;
        int j = 1;
        do {
            arrayRB[pos] = j;
            pos++;
            j++;
            if (pos == 10 || pos == 20 || pos == 30) {
                j = 1;
            }
        } while (pos < 40);
        System.out.println(Arrays.toString(arrayRB));
    }
    public static void barajar(int[] array) {
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
