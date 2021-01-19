package Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántas monedas de 2 euros tienes?: ");
        int dosEuros = sc.nextInt();
        System.out.println("Cuántas monedas de 1 euro tienes?: ");
        int unEuro = sc.nextInt();
        System.out.println("Cuántas monedas de 50 céntimos tienes?: ");
        double cincuentaCentimos = sc.nextInt();
        System.out.println("Cuántas monedas de 20 céntimos tienes?: ");
        double veinteCentimos = sc.nextInt();
        System.out.println("Cuántas monedas de 10 céntimos tienes?: ");
        double diezCentimos = sc.nextInt();
        double dinero = ((dosEuros * 2) + (unEuro * 1) + (cincuentaCentimos * 0.50) + (veinteCentimos * 0.20) + (diezCentimos * 0.10));
        System.out.println("Tienes " + dinero + " euros");
    }
}
