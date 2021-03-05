package Programación.EjerciciosSesión7;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número: (introduce 0 para finalizar)");
        int numero = sc.nextInt();
        int numeroMayor = 0;
        if (numero > numeroMayor) {
            numeroMayor = numero;
        }
        while (numero != 0) {
            System.out.println("Introduce un número: (introduce 0 para finalizar)");
            numero = sc.nextInt();
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
        }
        System.out.println("El número más alto ha sido: " + numeroMayor);
    }
}
