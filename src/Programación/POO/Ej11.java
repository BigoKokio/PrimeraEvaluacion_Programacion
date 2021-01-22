package Programación.POO;

import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desde = sc.nextInt();
        int hasta = sc.nextInt();
        System.out.println(sumaEnRango(desde, hasta));
    }
    public static long sumaEnRango(int desde, int hasta) {
        long suma = 0;
        for (int i = desde; i < hasta; i++) {
            suma += i;
        }
        return suma;
    }
}
