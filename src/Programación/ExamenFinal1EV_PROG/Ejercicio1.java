package Programación.ExamenFinal1EV_PROG;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de invitados: ");
        int invitados = sc.nextInt();
        int precioFinal = 0;
        if (invitados <= 200) {
            precioFinal = invitados * 95;
            System.out.println("El presupuesto del banquete es: " + precioFinal);
        } else if ((invitados > 200) && (invitados <= 300)) {
            precioFinal = invitados * 85;
            System.out.println("El presupuesto del banquete es: " + precioFinal);
        } else {
            precioFinal = invitados * 75;
            System.out.println("El presupuesto del banquete es: " + precioFinal);
        }
    }
}
