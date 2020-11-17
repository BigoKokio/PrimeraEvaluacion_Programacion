package Prácticas;

import java.util.Scanner;

public class Práctica4_SergioMurias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ejercicio a resolver");
        System.out.println("1. Sesión 6 Ejercicio 11 Bucle For");
        System.out.println("2. Sesión 7 ejercicio 7 Bucle While/Do-While");
        int respuesta = sc.nextInt();
        //El programa te pide que introduzcas un número, el cual se corresponde con un ejercicio.
        //Si el número introducido es distinto de 1 y distinto de 2, te vuelve a pedir que introduzcas un número con un mensaje de error.
        while ((respuesta != 1) && (respuesta != 2)) {
            System.out.println("Opción incorrecta");
            System.out.println("1. For");
            System.out.println("2. While");
            respuesta = sc.nextInt();
        }
        //Dependiendo de si el número introducido es un 1 o un 2, el bucle "switch" te lleva a dicho ejercicio.
        switch (respuesta) {
            case 1:
                System.out.println("Introduce el número de caracteres por fila: ");
                int filas = sc.nextInt();
                System.out.println("Introduce el número de columnas: ");
                int columnas = sc.nextInt();
                System.out.println("Introduce el caractér: ");
                char caracter = sc.next().charAt(0);
                //El primer bucle "for" es para el número de columnas.
                //El segundo bucle "for" es para el número de filas.
                //Dentro del segundo bucle "for" se imprimen los caracteres.
                //Es imprescindible usar "print" y no "println" ya que, si no, se dibujarían "n" filas en una sola columna.
                //Con un bucle "if" me aseguro de que el número de filas (base) siempre sea mayor que el número de columnas (altura).
                if (filas > columnas) {
                    for (int i = 1; i <= columnas; i++) {
                        for (int j = 1; j <= filas; j++) {
                            System.out.print(caracter);
                        }
                        System.out.println("");
                    }
                } else {
                    for (int i = 1; i <= filas; i++) {
                        for (int j = 1; j <= columnas; j++) {
                            System.out.print(caracter);
                        }
                        System.out.println("");
                    }
                }
                break;
            case 2:
                System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100.");
                System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
                System.out.println("Introduce un número entre 1 y 100: ");
                int numero = sc.nextInt();
                //La funcion "math.random" elige un número al azar. Dicha función tiene 2 parámetros: número maximo y número minimo.
                int random = (int) ((Math.random() * 100)+1);
                //Mientras el número que introduzcas sea distinto al elegido al azar y a 0, el programa te seguirá pidiendo que introduzcas un número.
                do {
                    //El programa te avisa si el número que has introducido es mayor o menor al que el ha elegido al azar.
                    if (random > numero) {
                        System.out.println("El número a encontrar es MAYOR");
                    } else {
                        System.out.println("El número a encontrar es MENOR");
                    }
                    System.out.println("Introduce un número entre 1 y 100: ");
                    System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
                    numero = sc.nextInt();
                } while ((numero != 0) && (numero != random));
                //Si has salido del bucle es porque o has acertado o has introducido un 0. Para cada caso, se usa un "if" para lanzar un mensaje al usuario.
                if (numero == random) {
                    System.out.println("¡Has acertado!");
                } else if (numero == 0) {
                    System.out.println("Te has rendido");
                }
                break;
        }
    }
}