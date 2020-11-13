package Ejemplos;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String Nombre = sc.nextLine();
        System.out.println("Hola, " + Nombre);
        //
        int x = 10;
        int y = 12;
        int z = x + y;
        System.out.println("El resultado es: " + z);
        //
        String diaDeLaSemana = "Viernes";
        System.out.println(diaDeLaSemana);
        //
        int uno = 1;
        int num = uno;
        System.out.println(num);
        //
        diaDeLaSemana = "Sábado";
        System.out.println(diaDeLaSemana);
        //
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        if (edad < 18) {
            System.out.println("Menor de edad");
        } else if (edad < 65) {
            System.out.println("Work in progress");
        } else if (edad < 70) {
            System.out.println("Jubilable");
        } else {
            System.out.println("Jubilado");
        }
        //
        System.out.println("Introduce un número del 1 al 7: ");
        int nDia = sc.nextInt();
        switch (nDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Debes introducir un número del 1 al 7: ");
                break;
        }
        //
        System.out.println("Introduce un número entero: ");
        int a = sc.nextInt();
        System.out.println("Introduce otro número mayor que el primero: ");
        int b = sc.nextInt();
        if (a < b) {
            int suma = 0;
            for (int i = 0; i < b; i++) {
                System.out.println(a);
                a = a + 1;
                suma = suma + a;
            }
            System.out.println(suma);
        } else {
            System.out.println("El segundo número debe ser mayor que el segundo");
        }
        //
        System.out.println("Introduce un número entero positivo: ");
        int a1 = sc.nextInt();
        if (a1 >= 0) {
            int mult = 0;
            int cont = 0;
            for (int i = 1; i <= 10; i++) {
                cont = cont + 1;
                mult = a1 * cont;
                System.out.println("Tabla del " + a1 + " : " + a1 + " * " + i + " = " + mult);
            }
        } else {
            System.out.println("El número debe ser positivo");
        }
        //
    }
}




