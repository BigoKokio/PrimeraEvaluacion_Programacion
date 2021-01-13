package Clase.Array;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nº alumnos: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); //Limpiar el scanner
        String[] nombres = new String[n];
        int[] edades = new int[n];
        //Pedir nombres y edades
        String respuesta = "seguir";
        for (int i = 0; i < n; i++) {
                System.out.println("Nombre: ");
                nombres[i] = sc.nextLine();
                System.out.println("Edad: ");
                edades[i] = sc.nextInt();
                sc.nextLine();
        }
    }
}
