package Programación.EjerciciosSesión7;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número entre 1 y 100: ");
        int numero = sc.nextInt();
        while ((numero < 1) || (numero > 100)) {
            System.out.println("El número " + numero + " no está en el rango introducido");
            System.out.println("Introduce un número entre 1 y 100: ");
            numero = sc.nextInt();
        }
        System.out.println("El número introducido es: " + numero);
    }
}
