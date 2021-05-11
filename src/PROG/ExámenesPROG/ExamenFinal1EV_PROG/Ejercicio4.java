package PROG.ExámenesPROG.ExamenFinal1EV_PROG;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacion;
        boolean seguir = true;
        do {
            do {
                System.out.println("Selecciona la operación que quieres realizar: ");
                System.out.println("1 - Suma");
                System.out.println("2 - Resta");
                System.out.println("3 - Multiplicación");
                System.out.println("4 - División");
                operacion = sc.nextInt();
            } while ((operacion != 1) && (operacion != 2) && (operacion != 3) && (operacion != 4));
            System.out.println("Introduce el primer operador: ");
            double operador1 = sc.nextInt();
            System.out.println("Introduce el segundo operador: ");
            double operador2 = sc.nextInt();
            switch (operacion) {
                case 1:
                    double suma = operador1 + operador2;
                    System.out.println(operador1 + " + " + operador2 + " = " + suma);
                    break;
                case 2:
                    double resta = operador1 - operador2;
                    System.out.println(operador1 + " - " + operador2 + " = " + resta);
                    break;
                case 3:
                    double multiplicacion = operador1 * operador2;
                    System.out.println(operador1 + " * " + operador2 + " = " + multiplicacion);
                    break;
                case 4:
                    double division = operador1 / operador2;
                    System.out.println(operador1 + " / " + operador2 + " = " + division);
                    break;
            }
            System.out.println("¿Quiéres realizar otra operación? (true/false)");
            seguir = sc.nextBoolean();
        } while (seguir);
    }
}
