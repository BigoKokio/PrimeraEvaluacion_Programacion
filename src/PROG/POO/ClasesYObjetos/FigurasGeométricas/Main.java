package Programación.POO.ClasesYObjetos.FigurasGeométricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        ArrayList<Punto> puntos = new ArrayList<>();
        /*
        System.out.println("--Punto 1--");
        System.out.println("Introduce X: ");
        Double X1 = sc.nextDouble();
        System.out.println("Introduce Y: ");
        Double Y1 = sc.nextDouble();
        */
        Punto P1 = new Punto(5, 9);
        puntos.add(P1);

        /*
        System.out.println("--Punto 2--");
        System.out.println("Introduce X: ");
        Double X2 = sc.nextDouble();
        System.out.println("Introduce Y: ");
        Double Y2 = sc.nextDouble();
        */
        Punto P2 = new Punto(13, 9);
        puntos.add(P2);

        /*
        System.out.println("--Punto 3--");
        System.out.println("Introduce X: ");
        Double X3 = sc.nextDouble();
        Double Y3 = sc.nextDouble();
        */
        Punto P3 = new Punto(13, 2);
        puntos.add(P3);

        /*
        System.out.println("--Punto 4--");
        System.out.println("Introduce X: ");
        Double X4 = sc.nextDouble();
        System.out.println("Introduce Y: ");
        Double Y4 = sc.nextDouble();
        */
        Punto P4 = new Punto(5, 2);
        puntos.add(P4);

        System.out.println("Esta figura tiene los siguientes puntos: ");
        for (int i = 0; i < puntos.size(); i++) {
            System.out.println("Punto " + (i + 1) + ": " + puntos.get(i));
        }
        System.out.println();

        System.out.println("**Creamos las cuatro líneas**");
        Línea L1 = new Línea(P1, P2);
        Línea L2 = new Línea(P2, P3);
        Línea L3 = new Línea(P3, P4);
        Línea L4 = new Línea(P1, P4);

        ArrayList<Línea> líneas = new ArrayList<>();
        líneas.add(L1);
        líneas.add(L2);
        líneas.add(L3);
        líneas.add(L4);
        for (int i = 0; i < líneas.size(); i++) {
            System.out.println(líneas.get(i).toString());
            líneas.get(i).dibujarLínea();
        }

    }
}
