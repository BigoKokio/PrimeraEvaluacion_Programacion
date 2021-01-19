package Soluciones;

import java.util.Scanner;

public class Ejercicio4Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 4.	Realizar un programa que, dados dos números y una operación introducidos por teclado, calcule el resultado.
        El programa debe mostrar un menú en el que se dan las siguientes opciones:
        1.	Suma
        2.	Resta
        3.	Multiplicación
        4.	División

        Si la opción introducida es incorrecta, debe seguir preguntando hasta que se introduzca una de las cuatro opciones ofrecidas.
        A continuación, debe pedir los operadores (operador1 y operador2). Se admiten operadores enteros.
        A continuación, debe mostrar el resultado de la operación introducida.
        El programa preguntará si se desea realizar otra operación (boolean seguir),
        si se teclea 0 el programa finaliza, si se teclea 1 seguirá operando.
        */

        boolean seguir = true;

        do {

            // solicitamos la operación, y seguimos preguntando hasta que se introduce una opción válida
            int operacion;
            do {
                System.out.println("Introduce una operación: \n1. Suma \n2. Resta \n3. Multiplicación \n4. División");
                operacion = sc.nextInt();
            } while (operacion < 1 || operacion > 4);

            // pedimos los operadores
            System.out.println("Introduce el primer operando: ");
            int operador1 = sc.nextInt();
            System.out.println("Introduce el segundo operando: ");
            int operador2 = sc.nextInt();

            // declaramos una variable para el resultado y hacemos los cálculos
            int resultado = 0;
            switch (operacion) {
                case 1:
                    resultado = operador1 + operador2;
                    break;
                case 2:
                    resultado = operador1 - operador2;
                    break;
                case 3:
                    resultado = operador1 * operador2;
                    break;
                case 4:
                    resultado = operador1 / operador2;
                    break;
            }

            // imprimimos el resultado y preguntamos si deseamos continuar
            System.out.println("El resultado es: " + resultado);

            System.out.println("¿Deseas continuar? \nSí -> true \nNo -> false");
            seguir = sc.nextBoolean();


        } while (seguir == true);
    }
}
