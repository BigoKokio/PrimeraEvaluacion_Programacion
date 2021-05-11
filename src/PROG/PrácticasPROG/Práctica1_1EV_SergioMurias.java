package PROG.PrácticasPROG;

import java.util.Scanner;

public class Práctica1_1EV_SergioMurias {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Momento Inicial: ");
        System.out.println("----------------");
        System.out.println("Introduce la hora: ");
        int H1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int M1 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int S1 = sc.nextInt();
        System.out.println("");
        System.out.println("Momento Final: ");
        System.out.println("---------------");
        System.out.println("Introduce la hora: ");
        int H2 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int M2 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int S2 = sc.nextInt();
        int MomentoInicial = (H1 * 3600) + (M1 * 60) + S1;
        int MomentoFinal = (H2 * 3600) + (M2 * 60) + S2;
        int dif = MomentoFinal - MomentoInicial;
        int H3 = (dif / 3600);
        int M3 = (dif % 3600) / 60;
        int S3 = (dif % 3600) % 60;
        System.out.println(H3 + ":" + M3 + ":" + S3);
    }
}

