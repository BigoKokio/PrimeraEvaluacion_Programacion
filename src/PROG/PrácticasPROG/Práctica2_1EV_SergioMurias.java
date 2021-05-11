package PROG.PrácticasPROG;

import java.util.Scanner;

public class Práctica2_1EV_SergioMurias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pides por teclado dos numeros
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();
        // Compruebas si son positivos. Si no lo son, termina el programa con un mensaje de error
        if ((num1 > 0) && (num2 > 0)) {
            // Pides el signo de la operacion
            System.out.println("Introduce la operación que quieres realizar: (+, -, *, /)");
            // Declaras una varible como string para recoger un caracter sin problema
            String operacion = sc.next();
            // En funcion de la operacion, el switch entra en un case
            switch (operacion) {
                case "+":
                    // Declaro la variable suma, la inicializo y muestro el resultado
                    int suma = num1 + num2;
                    System.out.println(suma);
                    break;
                case "-":
                    // Declaro la variable resta, la inicializo y muestro el resultado
                    int resta = num1 - num2;
                    System.out.println(resta);
                    break;
                case "*":
                    // Declaro la variable multiplicacion, la inicializo y muestro el resultado
                    int multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                    break;
                case "/":
                    // Declaro la variable division, la inicializo y muestro el resultado
                    int division = num1 / num2;
                    System.out.println(division);
                    break;
                // Si introduces un caracter que no espera el programa, termina el programa con un mensaje de error
                default:
                    System.out.println("Operación incorrecta");
                    break;
            }
        } else {
            System.out.println("Los números no son positivos");
        }
    }
}
