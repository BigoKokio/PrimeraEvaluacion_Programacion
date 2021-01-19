package Programación.EjerciciosForPDF;

import java.util.Scanner;

public class Ejercicio15_Pag49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contMayorEdad = 0;
        int sumaEdad = 0;
        float sumaAltura = 0;
        int contAltura = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entornos.Entornos.Entornos.Entornos.PrácticasEntornos.Alumno " + i);
            System.out.println("Introduce la edad: ");
            int edad = sc.nextInt();
            System.out.println("Introduce la altura en metros: ");
            float altura = sc.nextFloat();
            sumaEdad = sumaEdad + edad;
            sumaAltura = sumaAltura + altura;
            if (edad > 18) {
                contMayorEdad++;
            }
            if (altura > 1.75) {
                contAltura++;
            }
        }
        System.out.println("La altura media de los alumnos es de " + sumaAltura/5 + " metros.");
        System.out.println("La edad media de los alumnos es de " + sumaEdad/5 + " años.");
        System.out.println("Hay " + contMayorEdad + " alumnos mayores de edad.");
        System.out.println("Hay " + contAltura + " alumnos con una altura superior a 1,75 metros");
    }
}
