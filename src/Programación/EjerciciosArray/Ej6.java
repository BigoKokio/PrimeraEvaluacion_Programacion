package Programación.EjerciciosArray;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        /*
        Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
        diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para
        simplificarlo vamos a suponer que febrero tiene 28 días.
        */
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
