package Programación.EjerciciosForPDF;

import java.util.Scanner;

public class Ejercicio13_Pag46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contCero = 0;
        float sumaPositivo = 0;
        int contPositivo = 0;
        float sumaNegativo = 0;
        int contNegativo = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un número: ");
            float numero = sc.nextFloat();
            if (numero == 0) {
                contCero++;
            } else if (numero > 0) {
                sumaPositivo = sumaPositivo + numero;
                contPositivo++;
            } else {
                sumaNegativo = sumaNegativo + numero;
                contNegativo++;
            }
        }
        if (contPositivo == 0) {
            System.out.println("No has introducido ningún número positivo.");
        } else {
            System.out.println("La media de los números positivos es: " + (sumaPositivo/contPositivo));
        }
        if (contNegativo == 0) {
            System.out.println("No has introducido ningún número negativo.");
        } else {
            System.out.println("La media de los números negativos es: " + (sumaNegativo/contNegativo));
        }
        if (contCero == 0) {
            System.out.println("No has introducido ningún cero.");
        } else {
            System.out.println("El número de ceros es: " + contCero);
        }
    }
}
