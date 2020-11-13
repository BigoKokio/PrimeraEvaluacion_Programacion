package Prácticas;

import java.util.Scanner;

public class Práctica3_SergioMurias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // El programa primero pregunta por el tipo de estructura del que quiere resolver ejericios
        System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios?");
        System.out.println("1. If");
        System.out.println("2. Switch");
        int tipo = sc.nextInt();
        // Una vez conocido el tipo de estructura, se realiza un "switch" con dos "case", uno para cada tipo.
        switch (tipo) {
            case 1:
                System.out.println("Introduce el número de ejercicio que quieres que resuelva: ");
                System.out.println("1. Par-Impar");
                System.out.println("2. Sueldo anual (impuestos)");
                System.out.println("5. Triángulo válido");
                System.out.println("6. Fiesta de marmotas");
                System.out.println("7. Notas");
                int ejercicio1 = sc.nextInt();
                // Conocido el tipo, el programa pregunta por el ejercicio a resolver. Al igual que con el tipo, se realiza un "switch" con cinco "case", uno para cada ejercicio.
                switch (ejercicio1) {
                    case 1:
                        System.out.println("Introduce un numero");
                        int respuestaif1 = sc.nextInt();
                            // La forma de comprobar si un número es o no par es sabiendo el resto de la división entre dicho número y dos (módulo).
                            // Si dicho resto es igual a cero, es par, de lo contrario (else) es impar.
                            if (respuestaif1 % 2 == 0) {
                                System.out.printf("El numero introducido es par");
                            } else {
                                System.out.printf("El numero introducido es impar");
                            }
                            break;
                    case 2:
                        System.out.println("Introduce tu suelto anual");
                        int respuestaif2 = sc.nextInt();
                            // Con un "if" podemos comprobar si el sueldo introducido está sujeto a abonar impuestos.
                            // Si dicho sueldo es inferior a 9000, queda exento de pagarlos, de lo contrario tiene que pagarlos.
                            if (respuestaif2 > 9000) {
                                System.out.printf("Tu sueldo supera los 9000 euros anuales. Debes abonar impuestos");
                            } else {
                                System.out.printf("Tu sueldo no supera los 9000 euros anuales. No tienes que abonar impuestos");
                            }
                            break;
                    case 5:
                        System.out.println("Introduce los tres lados de tu triangulo:");
                        System.out.println("Lado 1");
                        int tri1 = sc.nextInt();
                        System.out.println("Lado 2");
                        int tri2 = sc.nextInt();
                        System.out.println("Lado 3");
                        int tri3 = sc.nextInt();
                        // Un triángulo es válido si la suma de sus dos lados es mayor que el tercer lado.
                        // Si tres lados son A, B y C, entonces se deben cumplir las tres condiciones.
                        // Para ello, usamos un "if" para que las tres condiciones se cumplan.
                        if ((tri1 + tri2 > tri3) && (tri1 + tri3 > tri2) && (tri2 + tri3 > tri1)) {
                            System.out.printf("SI");
                        } else {
                            System.out.printf("NO");
                        }
                        break;
                    case 6:
                        System.out.println("Introduce el número de tazas de mantequilla de cacahuete");
                        int taza = sc.nextInt();
                        System.out.println("¿Es fin de semana? true / false");
                        boolean finde = sc.nextBoolean();
                        // Para dividir un "if" por tramos usamos un "else if".
                        // En este caso, lo usamos para hacer tramos en función del número de tazas introducidos por el usuario.
                        if (taza >= 10 && taza <= 20 && finde == false) {
                            System.out.printf("True");
                        } else if (taza >= 15 && taza <= 25 && finde == true) {
                            System.out.printf("True");
                        } else {
                            System.out.printf("False");
                        }
                        break;
                    case 7:
                        System.out.println("Introduce tu nota numérica (entre 0 a 10)");
                        float nota = sc.nextFloat();
                        // Al igual que en el ejercicio anterior, usamos "else if" para dividir por tramos.
                        // En este caso, lo hacemos para dividir en función de una nota introducida por el usuario.
                        if (nota >= 0 && nota < 3) {
                            System.out.printf("MD");
                        } else if (nota > 3 && nota < 5 ) {
                            System.out.printf("INS");
                        } else if (nota >= 5 && nota < 6 ) {
                            System.out.printf("SUF");
                        } else if (nota >= 6 && nota < 7) {
                            System.out.printf("B");
                        } else if (nota >=7 && nota < 9) {
                            System.out.printf("N");
                        } else if (nota >= 9 && nota <= 10) {
                            System.out.printf("SB");
                        } else {
                            System.out.printf("Introduce un numero entre 0 y 10");
                        }
                        break;
                    // Si el número de ejercicio introducido no se corresponde con ninguno de la lista, saltará un mensaje de error y finalizará el programa.
                    default:
                        System.out.println("El Ejercicio " + ejercicio1 + " no forma parte de los ejercicios");
                        break;
                }
                break;
            case 2:
                System.out.println("Introduce el número de ejercicio que quieres que resuelva: ");
                System.out.println("2. Lenguaje programación");
                System.out.println("3. Número correspondiente");
                System.out.println("4. Harry Potter");
                System.out.println("5. Direcciones");
                int ejercicio2 = sc.nextInt();
                switch (ejercicio2) {
                    case 2:
                        System.out.println("¿Qué lenguaje de programación estás estudiando?");
                        System.out.println("a. Java");
                        System.out.println("b. Kotlin");
                        System.out.println("c. Scala");
                        System.out.println("d. Python");
                        String respuestasw1 = sc.next();
                        switch (respuestasw1) {
                            case "a":
                                System.out.println("¡Sí!");
                                break;
                            case "b":
                                System.out.println("¡No!");
                                break;
                            case "c":
                                System.out.println("¡No!");
                                break;
                            case "d":
                                System.out.println("¡No!");
                                break;
                            default:
                                System.out.println("Lenguaje desconocido");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Introduce un número en letra (1-9): ");
                        String respuestasw2 = sc.next();
                        switch (respuestasw2) {
                            case "uno":
                                System.out.println("1");
                                break;
                            case "dos":
                                System.out.println("2");
                                break;
                            case "tres":
                                System.out.println("3");
                                break;
                            case "cuatro":
                                System.out.println("4");
                                break;
                            case "cinco":
                                System.out.println("5");
                                break;
                            case "seis":
                                System.out.println("6");
                                break;
                            case "siete":
                                System.out.println("7");
                                break;
                            case "ocho":
                                System.out.println("8");
                                break;
                            case "nueve":
                                System.out.println("9");
                                break;
                            default:
                                System.out.println("Solo se pueden meter números del 1 al 9, ambos inclusives");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("¿De qué casa quieres saber el significado?");
                        System.out.println("Gryffindor");
                        System.out.println("Hufflepuff");
                        System.out.println("Slytherin");
                        System.out.println("Ravenclaw");
                        String respuestasw3 = sc.next();
                        switch (respuestasw3) {
                            case "Gryffindor":
                                System.out.println("Valentía");
                                break;
                            case "Hufflepuff":
                                System.out.println("Lealtad");
                                break;
                            case "Slytherin":
                                System.out.println("Astucia");
                                break;
                            case "Ravenclaw":
                                System.out.println("Intelecto");
                                break;
                            default:
                                System.out.println(respuestasw3 + " no es una casa válida");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Introduce una dirección: ");
                        System.out.println("1. Arriba");
                        System.out.println("2. Abajo");
                        System.out.println("3. Izquierda");
                        System.out.println("4. Derecha");
                        System.out.println("0. No mover");
                        int respuestasw4 = sc.nextInt();
                        switch (respuestasw4) {
                            case 1:
                                System.out.println("Subir");
                                break;
                            case 2:
                                System.out.println("Bajar");
                                break;
                            case 3:
                                System.out.println("Mover a la izquierda");
                                break;
                            case 4:
                                System.out.println("Mover a la derecha");
                                break;
                            case 0:
                                System.out.println("No mover");
                                break;
                            default:
                                System.out.println("¡Error!");
                                break;
                        }
                        break;
                    // Si el número de ejercicio introducido no se corresponde con ninguno de la lista, saltará un mensaje de error y finalizará el programa.
                    default:
                        System.out.println("El ejercicio " + ejercicio2 + " no forma parte de la práctica");
                        break;
                }
                break;
            // Si el número de estructura introducido no se corresponde con ninguno de la lista, saltará un mensaje de error y finalizará el programa.
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}

