package Clase.Sesión7;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número: (introduce 0 para finalizar)");
        int numero = sc.nextInt();
        int cont = 1;
        while (numero != 0) {
            System.out.println("Introduce un número: (introduce 0 para finalizar)");
            numero = sc.nextInt();
            cont++;
        }
        System.out.println("Has introducido " + cont + " números");
    }
}
