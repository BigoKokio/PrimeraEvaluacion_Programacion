package Clase.EjerciciosPDF;

import java.util.Scanner;

public class Ejercicio14_Pag48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contSueldo = 0;
        int sumaSueldo = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce tu sueldo: ");
            int sueldo = sc.nextInt();
            sumaSueldo = sumaSueldo + sueldo;
            if (sueldo >= 1000) {
                contSueldo++;
            }
        }
        System.out.println("La suma de los sueldos es: " + sumaSueldo + ".");
        System.out.println("Hay " + contSueldo + " sueldos mayores a 1000 euros.");
    }
}
