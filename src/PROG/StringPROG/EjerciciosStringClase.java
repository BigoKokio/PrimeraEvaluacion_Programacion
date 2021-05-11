package Programación.StringPROG;

import java.util.Scanner;

public class EjerciciosStringClase {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/* Ejercicio 1
Escribir por pantalla cada carácter de una cadena introducida por teclado. */
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }

/* Ejercicio 2
Realizar un programa que comprueba si una cadena leída por teclado comienza
por una subcadena introducida por teclado. */
        System.out.println("Ejercicio 1");
        System.out.println("===========");
        String string = "Escribir por pantalla"; // toLowerCase -> escribir por pantalla
        String subcadena = "es";
        System.out.println(string.toLowerCase().startsWith(subcadena.toLowerCase()));

/* Ejercicio 3
Pide una cadena y un carácter por teclado (valida que sea un carácter) y
muestra cuantas veces aparece el carácter en la cadena. */
        System.out.println("Ejercicio 3");
        System.out.println("===========");
        String cadena = "bla bla blablabla";
        char c = 'b';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c) {
                contador++;
            }
        }
        System.out.println("El carácter " + c + " aparece " + contador + " veces en "
                + cadena);

/* Ejercicio 4
Suponiendo que hemos introducido una cadena por teclado que representa una frase
(palabras separadas por espacios), realiza un programa que cuente
cuantas palabras tiene. */
        System.out.println("Ejercicio 4");
        System.out.println("===========");
        String cadej4 = " Una dos tres cuatro cinco seis ";
        cadej4 = cadej4.trim(); // quitamos los espacios al principio y al final

        int contadorej4 = 0;
        for (int i = 0; i < cadej4.length(); i++) {
            if (cadej4.charAt(i) == ' ') { // '' ' '
                contadorej4++;
            }
        }
        System.out.println("La cadena \"" + cadej4 + "\" tiene " +
                (contadorej4+1) + " palabras.");

/* Ejercicio 5
Si tenemos una cadena con un nombre y apellidos, realizar un programa que
muestre las iniciales en mayúsculas. */
        System.out.println("Ejercicio 5");
        System.out.println("===========");
        String personaje = "Don Quijote de la Mancha"; // DQDlM
        personaje = personaje.toUpperCase().trim();

        System.out.print(personaje.charAt(0));
        for (int i = 1; i < personaje.length(); i++) {
            if (personaje.charAt(i) == ' ') {
                System.out.print(personaje.charAt(i+1));
            }
        }

/* Ejercicio 6
Realizar un programa que, dada una cadena de caracteres,
genere otra cadena resultado de invertir la primera. */
        System.out.println("Ejercicio 6");
        System.out.println("===========");
        String cad6 = "Cadena de caracteres.";
        String otra = "";
        /* otra ="."
           otra = "." + "s"
           otra = ".s" + "e"
           otra = ".se" + "r"
         */
        for (int i = cad6.length() - 1; i >= 0 ; i--) {
            otra = otra + cad6.charAt(i);
            //System.out.println(otra);
        }
        System.out.println("Resultado: " + otra);

/* Ejercicio 7
Pide una cadena y dos caracteres por teclado
(valida que sea un carácter), sustituye la aparición del primer carácter en la cadena
por el segundo carácter. */
        System.out.println("Ejercicio 7");
        System.out.println("===========");
        String  cad7= "bla bla bla bla bla bla ";
        char c1 = 'a';
        char c2 = 'e';
        cad7 = cad7.replace(c1, c2);
        System.out.println(cad7);

/* Ejercicio 8
Realizar un programa que lea una cadena por teclado
y convierta las mayúsculas a minúsculas y viceversa. */
        System.out.println("Ejercicio 7");
        System.out.println("===========");
        String cad8 = "ViVa La GeNtE";
        for (int i = 0; i < cad8.length(); i++) {
            if (Character.isLowerCase(cad8.charAt(i))) {
                System.out.print(Character.toUpperCase(cad8.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(cad8.charAt(i)));
            }
        }

/* Ejercicio 9
Realizar un programa que compruebe si una cadena contiene una subcadena.
Las dos cadenas se introducen por teclado. */
        String cad9 = "Esto es la cadena entera.";
        String otracad = "subcadena";
        String otramas = "cadena";
        if (cad9.contains(otracad)) {
            System.out.println("La cadena \"" + cad9 + "\" contiene" + otracad);
        } else {
            System.out.println("La cadena \"" + cad9 + "\"no  contiene" + otracad);
        }

/* Ejercicio 10
Introducir una cadena de caracteres e indicar si es un palíndromo.
Una palabra palíndroma es aquella que se lee igual adelante que atrás. */
        String palin = "dabale arroz a la zorra el abad";
        palin = palin.replace(" ", "").trim();
        System.out.println(palin);

        String inversa = "";
        for (int i = palin.length() -1; i >=0 ; i--) {
            inversa = inversa + palin.charAt(i);
            System.out.println(inversa);
        }
        //System.out.println(palin.equals(inversa));
        System.out.println(palin.equalsIgnoreCase(inversa));
    }
}
