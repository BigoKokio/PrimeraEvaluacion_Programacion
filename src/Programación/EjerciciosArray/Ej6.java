package Programación.EjerciciosArray;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int mes;
        do {
            System.out.println("Introduce el número del mes: ");
            mes = sc.nextInt();
        } while ((mes < 1) || (mes > 12));
            int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            System.out.println("El mes " + mes + " tiene " + dias[mes - 1] + " dias y se corresponde con " + meses[mes - 1]);
    }
}
