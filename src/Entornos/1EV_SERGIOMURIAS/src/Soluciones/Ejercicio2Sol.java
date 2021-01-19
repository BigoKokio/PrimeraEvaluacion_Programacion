package Soluciones;

import java.util.Scanner;

public class Ejercicio2Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /* Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
            después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).
             */
        System.out.print("Monedas de 2 €    ");
        int m2€ = sc.nextInt();
        System.out.print("Monedas de 1 €    ");
        int m1€ = sc.nextInt();
        System.out.print("Monedas de 50 céntimos    ");
        int m50c = sc.nextInt();
        System.out.print("Monedas de 20 céntimos    ");
        int m20c = sc.nextInt();
        System.out.print("Monedas de 10 céntimos    ");
        int m10c = sc.nextInt();

        // convertimos todas las cantidads a céntimos
        int céntimosTotales = m2€ * 200 + m1€ * 100 + m50c * 50 + m20c * 20 + m10c * 10;
        //System.out.println(céntimosTotales);

        // la cantidad de euros será el cociente de dividir los céntimos totales entre 100,
        int euros = céntimosTotales / 100;
        // y los céntimos el resto
        int céntimos = céntimosTotales % 100;

        // indicamos el dinero que temenos
        System.out.println("Tienes " + euros + " euros y " + céntimos + " céntimos.");
    }
}
