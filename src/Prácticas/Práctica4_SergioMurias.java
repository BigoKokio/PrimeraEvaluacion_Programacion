package Prácticas;

import java.util.Scanner;

public class Práctica4_SergioMurias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ejercicio a resolver");
        System.out.println("1. Sesión 6 Ejercicio 11 Bucle For");
        System.out.println("2. Sesión 7 ejercicio 7 Bucle While/Do-While");
        int respuesta = sc.nextInt();
        while ((respuesta != 1) && (respuesta != 2)) {
            System.out.println("Opción incorrecta");
            System.out.println("1. For");
            System.out.println("2. While");
            respuesta = sc.nextInt();
        }
        switch (respuesta) {
            case 1:
                System.out.println("Introduce el número de caracteres por fila: ");
                int fila = sc.nextInt();
                System.out.println("Introduce el número de columnas: ");
                int columnas = sc.nextInt();
                System.out.println("Introduce el caractér: ");
                char caracter = sc.next().charAt(0);
                for (int i = 1; i <= columnas; i++) {
                    for (int j = 1; j <= fila; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100.");
                System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
                System.out.println("Introduce un número entre 1 y 100: ");
                int numero = sc.nextInt();
                int random = (int) ((Math.random() * 100)+1);
                do {
                    if (random > numero) {
                        System.out.println("El número a encontrar es MAYOR");
                    } else {
                        System.out.println("El número a encontrar es MENOR");
                    }
                    System.out.println("Introduce un número entre 1 y 100: ");
                    System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
                    numero = sc.nextInt();
                } while ((numero != 0) && (numero != random));
                if (numero == random) {
                    System.out.println("¡Has acertado!");
                } else if (numero == 0) {
                    System.out.println("Te has rendido");
                }
        }
    }
}