package Ejemplos;

import java.util.Arrays;
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
        // Tabla de multiplicar de un número
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
        // Mostrar un número invertido
        System.out.println("Introduce un número de tres dígitos: ");
        int numero = sc.nextInt();
        int centenas = numero / 100;
        int decenas =  (numero % 100) / 10;
        int unidades = (numero % 100) % 10;
        if (unidades != 0) {
            System.out.print(unidades);
            System.out.print(decenas);
            System.out.print(centenas);
        } else {
            System.out.print(decenas);
            System.out.print(centenas);
        }
        // Introducir números en un array
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número: ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        // Comprobar si un array está ordenado
        int[] array2 = {1, 3, 6, 7, 8, 9};
        boolean ordenado = true;
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] > array2[i + 1]) {
                ordenado = false;
                break;
            }
        }
        if (ordenado == true) {
            System.out.println("El array está ordenado");
        } else {
            System.out.println("El array está ordenado");
        }
        // Otra forma de recorrer un array
        for (int elem : array) { // Para cada elemento del array "array"
            System.out.print(elem + " ");
        }
    }
}




