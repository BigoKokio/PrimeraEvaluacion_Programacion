package Pruebas;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100.");
        int random = (int) ((Math.random() * 100)+1);
        //System.out.println(random);
        System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
        System.out.println("Introduce un número entre 1 y 100: ");
        int numero = sc.nextInt();
        while ((numero < 1) || (numero > 100)) {
            System.out.println("El número que has introducido está fuera del rango.");
            System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
            System.out.println("Introduce un número entre 1 y 100: ");
            numero = sc.nextInt();
        }
        while ((numero != 0) && (numero != random)) {
            if (random > numero) {
                System.out.println("El número a encontrar es MAYOR");
            } else {
                System.out.println("El número a encontrar es MENOR");
            }
            System.out.println("Introduce un número entre 1 y 100: ");
            System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
            numero = sc.nextInt();
            while ((numero < 1) || (numero > 100)) {
                System.out.println("El número que has introducido está fuera del rango.");
                System.out.println("Si en algún momento deseas rendirte, introduce el número 0.");
                System.out.println("Introduce un número entre 1 y 100: ");
                numero = sc.nextInt();
            }
        }
        if (numero == random) {
            System.out.println("¡Has acertado!");
        } else if (numero == 0) {
            System.out.println("Te has rendido, el número al azar era " + random);
        }
    }
}
