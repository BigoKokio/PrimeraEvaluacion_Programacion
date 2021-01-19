package Soluciones;

import java.util.Scanner;

public class Ejercicio3Sol {
    public static void main(String[] args) {
       /* Escribe un programa que imprima por pantalla la suma de los n primeros números múltiplos de 3
       que además sean pares, siendo n un número introducido por teclado.
       Por ejemplo, si introducimos 4 debe imprimir 60, que es la suma de 6 + 12 + 18 + 24.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int n = sc.nextInt();

        int i = 3;
        int suma = 0;
        int contador = 0;
        do {
                if (i % 3 == 0 && i % 2 == 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }
            i++;
        } while (contador < n);

        System.out.println();
        System.out.println(suma);

    }
}
