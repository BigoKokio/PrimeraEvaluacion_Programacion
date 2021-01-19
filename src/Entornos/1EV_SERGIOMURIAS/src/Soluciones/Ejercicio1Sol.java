package Soluciones;

import java.util.Scanner;

public class Ejercicio1Sol {
    public static void main(String[] args) {
        /* 1.	Tenemos una empresa dedicada a ofrecer banquetes. Sus tarifas son las siguientes:
        El precio del menú por persona es de 95 €, pero si el número de personas es mayor que 200 pero menor o igual a 300,
         el precio es de 85€. Para más de 300 personas el precio por menú es de 75€.

                Hacer un programa que pida el número de invitados y calcule el presupuesto del banquete.
        */

        Scanner sc = new Scanner(System.in);
        int invitados;
        do {
            System.out.println("Introduce el número de invitados: ");
            invitados = sc.nextInt();
        } while (invitados <= 0); // comprobamos que se introduza un número de invitados mayor que 0

        int resultado;

        if (invitados <= 200) {
            resultado = invitados * 95;
        } else if (invitados <= 300) {
            resultado = invitados * 85;
        } else {
            resultado = invitados * 75;
        }

        System.out.println("El presupuesto para " + invitados + " invitados es de " + resultado + "€");
    }

}
