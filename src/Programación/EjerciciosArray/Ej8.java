package Programación.EjerciciosArray;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        /*
        Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un
        programa que introduzca el nombre y la edad de cada alumno. El proceso de lectura de
        datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará
        los siguientes datos:
            • Todos lo alumnos mayores de edad.
            • Los alumnos mayores (los que tienen más edad)
        */
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nº alumnos:");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); // "limpiar" el scanner
        String[] nombres = new String[n];
        int[] edades = new int[n];
        // Pedir nombres y edades
        String respuesta;
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre: (* para terminar) ");
            respuesta = sc.nextLine();
            // si respuesta es * - > salir del bucle
            if (respuesta.equals("*")) {  //"Aaaa".equals("*") --> false  "*".equals("*") --> true
                break;
            } else { // si no, guardar nombre en el array y preguntar edad
                nombres[i] = respuesta;
                System.out.println("Edad: ");
                edades[i] = sc.nextInt();
                sc.nextLine();
            }
        }
        //System.out.println(Arrays.toString(nombres) + " " + Arrays.toString(edades));
        System.out.println("Alumnos mayores de edad:");
        for (int i = 0; i < n; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " (" + edades[i] + ")");
            }
        }
        // Entornos.Entornos.Entornos.Entornos.PrácticasEntornos.Alumno de más edad
        int maximo = edades[0];
        int pos = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > maximo) {
                maximo = edades[i];
                pos = i;
            }
        }
        System.out.println("Entornos.Entornos.Entornos.Entornos.PrácticasEntornos.Alumno de más edad: " + nombres[pos] + " (" + edades[pos] + ")");
        System.out.println("Extraer todos los alumnos mayores de: ");
        int pCorte = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (edades[i] >= pCorte) {
                System.out.println(nombres[i] + " (" + edades[i] + ")");
            }
        }
    }
}
