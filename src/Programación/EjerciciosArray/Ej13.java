package Programación.EjerciciosArray;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nConductores = 0;
    do {
        System.out.println("Introduce el número de conductores: ");
        nConductores = sc.nextInt();

    } while (nConductores <= 0);
    sc.nextLine(); // Liberar el objeto Scanner para poder meter Strings
    String[] nombre = new String[nConductores];
    for (int i = 0; i < nConductores; i++) {
        System.out.println("Introduce el nombre del " + (i+1) + "º conductor: ");
        nombre[i] = sc.nextLine();
    }
    }
}
